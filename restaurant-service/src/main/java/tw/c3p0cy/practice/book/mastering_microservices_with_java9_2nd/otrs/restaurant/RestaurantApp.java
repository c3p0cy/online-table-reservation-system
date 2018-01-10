package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RestaurantApp {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(RestaurantApp.class, args);
  }

}
