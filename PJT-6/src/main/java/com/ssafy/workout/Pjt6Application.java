package com.ssafy.workout;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.ssafy.workout.dao")
public class Pjt6Application {

	public static void main(String[] args) {
		SpringApplication.run(Pjt6Application.class, args);
	}
}
