package com.user.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user_reg")
public class UserRegistration {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer regId;
	private String userName;
	private String email;
	private String password;
	private Integer phoNo;
	private String  pswd_update;
	
	@OneToOne
	@JoinColumn(name="countryName")
	private Countries country;
	
	@OneToOne
	@JoinColumn(name="stateName")
	private States state;
	
	@OneToOne
	@JoinColumn(name="cityName")
	private City city;
	
	@CreationTimestamp
	private LocalDate createdDate;
	
	@UpdateTimestamp
	private LocalDate updatedDate;

	public Integer getRegId() {
		return regId;
	}

	public void setRegId(Integer regId) {
		this.regId = regId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoNo() {
		return phoNo;
	}

	public void setPhoNo(Integer phoNo) {
		this.phoNo = phoNo;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries country) {
		this.country = country;
	}

	public States getState() {
		return state;
	}

	public void setState(States state) {
		this.state = state;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPswd_update() {
		return pswd_update;
	}

	public void setPswd_update(String pswd_update) {
		this.pswd_update = pswd_update;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public UserRegistration(Integer regId, String userName, String email, Integer phoNo, Countries country,
			States state, City city) {
		super();
		this.regId = regId;
		this.userName = userName;
		this.email = email;
		this.phoNo = phoNo;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public UserRegistration(Integer regId, String userName, String email, String password, Integer phoNo,
			String pswd_update, Countries country, States state, City city, LocalDate createdDate,
			LocalDate updatedDate) {
		super();
		this.regId = regId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.phoNo = phoNo;
		this.pswd_update = pswd_update;
		this.country = country;
		this.state = state;
		this.city = city;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
	}

	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
