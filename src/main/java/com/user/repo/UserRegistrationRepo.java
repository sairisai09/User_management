package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Dto.UserRegistrationDTO;
import com.user.entity.UserRegistration;

public interface UserRegistrationRepo extends JpaRepository<UserRegistration,Integer>{

	UserRegistrationDTO findByEmail(String email);

}
