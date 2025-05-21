package jtt.projekts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jtt.projekts.dao.UserDAO;
import jtt.projekts.dto.User;

@Controller
public class WebController {
	@Autowired
	UserDAO userDAO;
	
	@GetMapping("/")
	public String greeting(Model model) {
		// userDAO.insert(new User("aigars2", "aigars.asaks@jak.lv", "qwerty123", "admin"));
		model.addAttribute("message", "hello world");
		return "index";
		
		
	}
	@GetMapping("/login")
	public String greeting2(Model model) {
		// userDAO.insert(new User("aigars2", "aigars.asaks@jak.lv", "qwerty123", "admin"));
		model.addAttribute("message", "hello world");
		return "login";
		
		
	}
	
	@GetMapping("/register")
	public String greeting3(Model model) {
		// userDAO.insert(new User("aigars2", "aigars.asaks@jak.lv", "qwerty123", "admin"));
		model.addAttribute("message", "hello world");
		return "register";
		
		
	}
}
