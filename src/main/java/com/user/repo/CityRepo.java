package com.user.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.City;

public interface CityRepo extends JpaRepository<City , Integer>{

	List<City> findByStateId(Integer sid);

}
