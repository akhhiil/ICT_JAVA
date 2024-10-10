package com.ukf.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ukf.demo.model.Customer;
import com.ukf.demo.repository.CustomerRepository;

@SpringBootApplication
public class DemoSpring1Application  implements CommandLineRunner{
	@Autowired
	CustomerRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpring1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
	    //Customer customer = new Customer(1, "john", 23);
	    //repo.save(customer);
	    repo.deleteById(1);
	    System.out.println("customer deleted!");
	}


}
