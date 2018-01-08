package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author Sourabh Sharma
 */
@SpringBootApplication
@EnableEurekaClient
public class UsersApp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(UsersApp.class, args);
    }

}