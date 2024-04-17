package com.user.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.Dto.LoginDto;
import com.user.Dto.ResetPswdDto;
import com.user.Dto.UserRegistrationDTO;
import com.user.entity.City;
import com.user.entity.Countries;
import com.user.entity.States;
import com.user.repo.CityRepo;
import com.user.repo.CountriesRepo;
import com.user.repo.StatesRepo;
import com.user.repo.UserRegistrationRepo;

@Service
public class UserRegServiceImpl implements UserRegService {
	
	@Autowired
	private UserRegistrationRepo userrepo;
	
	@Autowired
	private CountriesRepo countryrepo;
	
	//@Autowired
	//private StatesRepo statesrepo;

	@Autowired
	private CityRepo cityrepo;
	
	
	@Override
	public List <Countries> getCountries() {
		// TODO Auto-generated method stub
		  List<Countries> all = countryrepo.findAll();
		return all ;
	
	}


	  @Override 
	  public List<States> getStates(Integer cid) { // TODO Auto-generated
	  //method stub
	 
	 // return statesrepo.findByCountryId(cid); }
	

	@Override
	public List<City> getCity(Integer sid) {
		
		// TODO Auto-generated method stub
		return cityrepo.findByStateId(sid);
	}

	@Override
	public boolean registerUser(UserRegistrationDTO user) {
		UserRegistrationDTO byEmail = userrepo.findByEmail(user.getEmail());
		
		if(byEmail!=null) {
		
		return false;
	}
		else {
			UserRegistrationDTO reg = new UserRegistrationDTO();
			reg.setCountry(user.getCountry());
			reg.setState(user.getState());
			reg.setCity(user.getCity());
			
			
			
			reg.setPswd_update(false);
			
			
			
			}
		return false;
		}

	@Override
	public UserRegistrationDTO findByemail(String email) {
		// TODO Auto-generated method stub
		return userrepo.findByEmail(email);
	}

	@Override
	public UserRegistrationDTO Login(LoginDto login) {
		// TODO Auto-generated method stub
		
		
		return null;
	}

	@Override
	public boolean resetpwd(ResetPswdDto reset) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getQuotes() {
		// TODO Auto-generated method stub
		return null;
	}

}
