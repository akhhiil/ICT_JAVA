package com.example.demo.model;


import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee3 {
	@Id
	private int id;
	private String name;
	@Embedded
	private Address address;
	public Employee3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee3(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee3 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
