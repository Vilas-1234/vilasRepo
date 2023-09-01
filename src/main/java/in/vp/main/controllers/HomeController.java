package in.vp.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.vp.main.entity.User;
import in.vp.main.service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	UserService userService;
	
	@GetMapping("/user")
	public User CreateUser(@RequestBody User user) {
		
	return userService.createUser(user);
	}

}
