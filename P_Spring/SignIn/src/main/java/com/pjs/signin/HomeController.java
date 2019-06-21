package com.pjs.signin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		Object isSignIn = session.getAttribute("sign_in");
		if (isSignIn != null && (Boolean) isSignIn) {
			DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\student190527.sqlite", "student190527");
			model.addAttribute("select_result", dbCommon.selectDataTableTag(new People()));
			return "list";
		} else {
			return "redirect:/sign_in";
		}

	}

	@RequestMapping(value = "/sign_in", method = RequestMethod.GET)
	public String signIn(Locale locale, Model model) {
		return "sign_in";
	}

	@RequestMapping(value = "/do_sign_in", method = RequestMethod.GET)
	public String doSignIn(Locale locale, Model model, HttpServletRequest request, @RequestParam("id") String id,
			@RequestParam("password") String password) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\student190527.sqlite", "student190527");
		if (dbCommon.signIn(id, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("sign_in", true);
			return "redirect:/";
		} else {
			return "redirect:/sign_in";
		}
	}

	@RequestMapping(value = "/sign_out", method = RequestMethod.GET)
	public String signOut(Locale locale, Model model, HttpServletRequest request) {
		HttpSession session = request.getSession();
		// 세션의 모든 데이터가 날아가는 메소드
		session.invalidate();
		return "redirect:/sign_in";
	}

	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model, @RequestParam("idx") int idx, @RequestParam("name") String name,
			@RequestParam("id") String id, @RequestParam("password") String password,
			@RequestParam("address") String address, @RequestParam("birthday") String birthday,
			@RequestParam("favoriteColor") String favoriteColor) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\student190527.sqlite", "student190527");
		dbCommon.insertData(new People(name, id, address, birthday, favoriteColor, password));
		return "input";
	}

	@RequestMapping(value = "/modify", method = RequestMethod.GET)
	public String modify(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\student190527.sqlite", "student190527");
		model.addAllAttributes(dbCommon.detailsData(new People(), idx));
		return "modify";
	}

	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(Locale locale, Model model, @RequestParam("idx") int idx,
			@RequestParam("name") String name, @RequestParam("id") String id, @RequestParam("password") String password,
			@RequestParam("address") String address, @RequestParam("birthday") String birthday,
			@RequestParam("favoriteColor") String favoriteColor) {
		DBCommon<People> dbCommon = new DBCommon<People>("c:\\tomcat\\student190527.sqlite", "student190527");
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			StringBuilder sb = new StringBuilder();
			for (byte b : md.digest()) {
				sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
			}
			password = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		dbCommon.updateData(new People(name, id, address, birthday, favoriteColor, password), idx);
		return "done";
	}
}
