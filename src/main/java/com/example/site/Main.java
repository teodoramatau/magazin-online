package com.example.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLException;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);

		System.out.println("#####################################################");
		System.out.println("# All systems are up. Application is ready to roll. #");
		System.out.println("#####################################################");
	}
}