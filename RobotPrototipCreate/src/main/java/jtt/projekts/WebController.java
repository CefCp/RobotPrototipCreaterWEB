package jtt.projekts;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jtt.projekts.dao.UserDAO;
import jtt.projekts.dao.impl.UserDAOImpl;
import jtt.projekts.dto.User;

@Controller
public class WebController {
	@Autowired
	UserDAO userDAO;
	@Autowired
	UserDAOImpl userService;
	@GetMapping("/")
	public String greeting(Model model) {
		// userDAO.insert(new User("aigars2", "aigars.asaks@jak.lv", "qwerty123", "admin"));
		model.addAttribute("message", "hello world");
		return "index";
		
		
	}
	@GetMapping("/login")
	public String greeting2(Model model) {
		
		model.addAttribute("message", "hello world");
		return "login";
		
		
	}
	
	@GetMapping("/register")
	public String greeting3(Model model) {
		
		model.addAttribute("message", "hello world");
		return "register";
		
		
	}
	
	@GetMapping("/shop")
	public String greeting4(Model model) {
		
		model.addAttribute("message", "hello world");
		return "shop";
		
		
	}
	
	@GetMapping("/stafflogin")
	public String greeting5(Model model) {
		
		model.addAttribute("message", "hello world");
		return "stafflogin";
		
		
	}
	
	@GetMapping("/staffMenu")
	public String greeting6(Model model) {
		
		model.addAttribute("message", "hello world");
		return "staffMenu";
		
		
	}
	
	@PostMapping("/signup")
	public String signup(@RequestParam String username,  @RequestParam String password,@RequestParam String email,  Model model) throws SQLException {

		String defaultRole = "user";
		if(userService.getByName(username )!= null) {
	model.addAttribute("error", "username is taken");
	return "register";
			
			
}
		User user = new User();
		user.setName(username);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(defaultRole);
		userService.insert(user);
		return "index";
		
		
	}
	@PostMapping("/login")
	public String login(@RequestParam String password, @RequestParam String email, Model model) throws SQLException {
		if(userService.getByEmail(email) == null) {
			model.addAttribute("error", "email isn't added to our data");
			return "regiter";
		}else if(userService.getByEmail(email).getPassword() != password) {
				model.addAttribute("error", "password isn't correct");
				return "index";
			
		}
		
		
		
		return "index";
		
		
		
	}
	
	@PostMapping("/stafflogin")
	public String stafflogin(@RequestParam String password, @RequestParam (value = "email")String email, Model model) throws SQLException {
		if(userService.getByEmail(email) == null) {
			model.addAttribute("error", "email isn't added to our data");
			return "stafflogin";
		}else if(userService.getByEmail(email).getPassword() == password && userService.getByEmail(email).getRole() == "admin") {
			return "staffMenu";
			
		}
		
		model.addAttribute("error", "your not an admin ! go back to persona log in!");
		return "index";
		
	
		
		
		
	}
}
