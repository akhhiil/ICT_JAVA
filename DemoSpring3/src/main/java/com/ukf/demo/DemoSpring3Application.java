package com.ukf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ukf.demo.model.Customer;

@SpringBootApplication
public class DemoSpring3Application implements CommandLineRunner{
	@Autowired
	com.ukf.repository.CustomerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring3Application.class, args);
	}
	@Override
	public void run(String... args)throws Exception{
		Customer customer1=new Customer("akhil");
		Customer customer2=new Customer();
		
//		customer2.setId(4);
		customer2.setName("mike");
		repo.save(customer1);
		repo.save(customer2);
		System.out.println("CUSTOMER ADDED");
		
	}

}
