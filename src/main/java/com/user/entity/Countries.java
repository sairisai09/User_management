package com.user.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="countries")
public class Countries {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer countryId;
	private String countryName;
	
	@OneToMany(mappedBy="country" , cascade=CascadeType.ALL)
	private List<States> state;
	
	public List<States> getState() {
		return state;
	}
	public void setState(List<States> state) {
		this.state = state;
	}
	public Integer getCountryId() {
		return countryId;
	}
	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Countries(Integer countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	public Countries() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
