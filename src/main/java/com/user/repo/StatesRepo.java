package com.user.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.States;

public interface StatesRepo extends JpaRepository<States,Integer> {

	List<States> findByCountryId(Integer cid);

}
