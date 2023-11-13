package com.study.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	
	@Id
	@Column(name = "id")
	public Long id;
	@Column(name = "city")
	public String city; 
	@Column(name = "state")     
	public String state; 
	@Column(name = "country")
	public String country;
	@Column(name = "pin")
    public int pin;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin
				+ "]";
	}
    
}
