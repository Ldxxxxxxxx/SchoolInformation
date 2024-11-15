package com.ldx.StudentManageSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ldx")
public class StudentManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentManageSystemApplication.class, args);
    }

}
