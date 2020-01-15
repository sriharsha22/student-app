package com.harsha.studentsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class StudentsappApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentsappApplication.class, args);
    }

}
