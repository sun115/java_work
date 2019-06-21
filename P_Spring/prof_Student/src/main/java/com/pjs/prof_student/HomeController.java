package com.pjs.prof_student;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student190527");
//		ArrayList<People> studentList = dbCommon.selectArrayList(new People());
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Student()));
		return "list";
	}
	
	@RequestMapping(value = "/create_table", method = RequestMethod.GET)
	public String createTable(Locale locale, Model model) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student190527");
		dbCommon.createTable(new Student());
		return "done";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(
			@RequestParam("name") String name,
			@RequestParam("favoriteColor") String favoriteColor, 
			@RequestParam("address") String address, 
			@RequestParam("birthday_month") String birthday_month, 
			@RequestParam("birthday_day") String birthday_day) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student190527");
		dbCommon.insertData(new Student(name, address, birthday_month+"/"+birthday_day , favoriteColor));
		return "done";
	}
	
	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student190527");
		Student details = dbCommon.detailsData(new Student(), idx);
		if (details != null) {
			model.addAttribute("idx_value", details.idx);
			model.addAttribute("name_value", details.name);
			model.addAttribute("address_value", details.address);
			model.addAttribute("color_value", details.favoriteColor);
			String[] birthdaySplit = details.birthday.split("/");
			if (birthdaySplit.length == 2) {
				model.addAttribute("select_month_" + birthdaySplit[0], "selected");
				model.addAttribute("select_day_" + birthdaySplit[1], "selected");
			}
		}
		System.out.println(details.idx+" "+details.name+" "+details.address+" "+details.favoriteColor);
		return "modify";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String update_data(Locale locale, Model model,
			@RequestParam("idx") int idx,
			@RequestParam("name") String name,
			@RequestParam("favoriteColor") String favoriteColor, 
			@RequestParam("address") String address, 
			@RequestParam("birthday_month") String birthday_month, 
			@RequestParam("birthday_day") String birthday_day) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat\\student190527.sqlite", "student190527");
		dbCommon.updateData(new Student(name, address, birthday_month + "/" + birthday_day, favoriteColor), idx);
		return "done";
	}
}
