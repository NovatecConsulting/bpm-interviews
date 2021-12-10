package info.novatec.bpm.interviews.praktikum;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class running the application with embedded camunda engine.
 * 
 * @author Ben Fuernrohr
 */
@SpringBootApplication
@EnableProcessApplication
public class ApplicationApp {

    public static void main(String... args) {
        SpringApplication.run(ApplicationApp.class, args);
    }

}