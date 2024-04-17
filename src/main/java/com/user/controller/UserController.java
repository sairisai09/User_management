package com.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.user.Dto.LoginDto;
import com.user.Dto.ResetPswdDto;
import com.user.Dto.UserRegistrationDTO;
import com.user.service.UserRegService;

import ch.qos.logback.core.model.Model;

@Controller
public class UserController {
	
	@Autowired
	private UserRegService userservice;
	
	
	public String getRegpage(Model model) {
		return null;
	}

	public Map<Integer,String> getStates(Integer cid) {
		return null;
	}
	
	public Map<Integer,String> getCities(Integer sid) {
		return null;
	}
	
	public String register(UserRegistrationDTO register) {
		return null;
	}
	
	public String loginpage(Model model) {
		return null;
	}
	
	public String handleLogin(LoginDto login , Model model) {
		return null;
	}
	public String resetpswd(ResetPswdDto reset) {
		return null;
	}
	
	public String dashboardpage(Model model) {
		return null;
	}
	
	public String logout() {
		return null;
	}
	
	
}
