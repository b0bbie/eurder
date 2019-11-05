package com.eurder.war;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = "com.eurder")
public class EurderApp {
    public static void main(String[] args) {
                SpringApplication.run(EurderApp.class, args);
            }
}
