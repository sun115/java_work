package com.pjs.spring02;

import java.text.DateFormat;
import java.util.Date;
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
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		return "list";
	}
	
	@RequestMapping(value = "/input_student", method = RequestMethod.GET)
	public String input_student(Locale locale, Model model) {
		return "input_student";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String input_data(Locale locale, Model model) {
		
		return "done";
	}
	
	@RequestMapping(value = "/create_db", method = RequestMethod.GET)
	public String create_db(Locale locale, Model model) {
		CreateDatabase createDatabase = new CreateDatabase();
		createDatabase.createTable();
		return "done";
	}
	
	@RequestMapping(value = "/insert_data", method = RequestMethod.GET)
	public String insert_data(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("birthday") String birthday) {
		Student student = new Student(name, address, birthday);
		InsertData insert = new InsertData();
		insert.insertStudent(student);
		return "done";
	}
	
}
