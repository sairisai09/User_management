package com.user.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="states")
public class States {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stateId;
	private String stateName;
	
	@ManyToOne
	@JoinColumn(name="countryId",nullable=false)
	private Countries country;
	
	@OneToMany(mappedBy="state", cascade=CascadeType.ALL)
	private List <City> cities;

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	public Integer getStateId() {
		return stateId;
	}

	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}

	public States(Integer stateId, String stateName, Countries countryId) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.country = country;
	}

	public States() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
