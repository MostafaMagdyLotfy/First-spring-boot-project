package com.example.firstproject.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student mostafa =new Student(
					"Mostafa Magdy",
					"MostafaMagdy@gmail.com",
					LocalDate.of(1998, 9, 11)
					);
			Student mohamed =new Student(
					"Mohamed",
					"Mohamed@gmail.com",
					LocalDate.of(2000, 3, 17)
					);
			repository.saveAll(List.of(mostafa,mohamed));
				 
		};
	}
}
