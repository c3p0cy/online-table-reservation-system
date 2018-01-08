package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.eureka.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class App {

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
