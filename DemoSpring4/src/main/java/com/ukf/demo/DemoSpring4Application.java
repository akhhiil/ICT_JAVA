package com.ukf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ukf.demo.model.Account;
import com.ukf.demo.model.Customer;
import com.ukf.demo.repository.AccountRepository;
import com.ukf.demo.repository.CustomerRepository;

@SpringBootApplication
public class DemoSpring4Application implements CommandLineRunner{
	@Autowired
	CustomerRepository repoC;
	AccountRepository repoA;
	public static void main(String[] args) {
		SpringApplication.run(DemoSpring4Application.class, args);
	}
	@Override
	public void run(String... args) {
		
		Account account1=new Account("A01","savings");
		Customer customer1=new Customer("amal",account1);
		repoC.save(customer1);
		
	}
	
}
