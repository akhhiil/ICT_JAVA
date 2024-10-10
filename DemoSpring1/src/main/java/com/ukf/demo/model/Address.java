package com.ukf.demo.model;

import jakarta.persistence.Embeddable;
@Embeddable
public class Address {
	private String housename;
	private String street;
	private String city;
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String housename, String street, String city, int pincode) {
		super();
		this.housename = housename;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}
	public String getHousename() {
		return housename;
	}
	public void setHousename(String housename) {
		this.housename = housename;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [housename=" + housename + ", street=" + street + ", city=" + city + ", pincode=" + pincode
				+ "]";
	}
	
}
