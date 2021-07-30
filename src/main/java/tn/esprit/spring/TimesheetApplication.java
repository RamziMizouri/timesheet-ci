package tn.esprit.spring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tn.esprit.spring.services.ContratServiceImpl;

@SpringBootApplication
//@EnableAutoConfiguration
public class TimesheetApplication {
	public static void main(String[] args) 
	{
	SpringApplication.run(TimesheetApplication.class, args);
	 ContratServiceImpl c = new ContratServiceImpl();
       c.retrieveAllContrats();
	}



}