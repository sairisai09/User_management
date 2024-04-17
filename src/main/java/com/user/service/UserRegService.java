package com.user.service;

import java.util.List;
import java.util.Map;

import com.user.Dto.LoginDto;
import com.user.Dto.ResetPswdDto;
import com.user.Dto.UserRegistrationDTO;
import com.user.entity.City;
import com.user.entity.Countries;
import com.user.entity.States;
import com.user.entity.UserRegistration;

public interface UserRegService {
	
   
	public List<Countries> getCountries();
    public List<States> getStates(Integer cid);
    public List<City>  getCity(Integer sid);
	public boolean registerUser(UserRegistrationDTO user);
	
	public UserRegistrationDTO findByemail(String email); 
	public  UserRegistrationDTO Login (LoginDto login);
	public boolean resetpwd(ResetPswdDto reset);
	public String getQuotes();
	

}
