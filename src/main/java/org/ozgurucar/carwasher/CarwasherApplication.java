package org.ozgurucar.carwasher;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarwasherApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CarwasherApplication.class, args);
    }
    @Value("${spring.application.name}")
    private String applicationName;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application Name: " + applicationName);
    }
}
