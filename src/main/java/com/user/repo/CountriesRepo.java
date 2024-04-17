package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Countries;

public interface CountriesRepo extends JpaRepository<Countries , Integer> {

}
