package info.novatec.bpm.interviews.junior;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class ApplicationApp {

    public static void main(String... args) {
        SpringApplication.run(ApplicationApp.class, args);
    }

}