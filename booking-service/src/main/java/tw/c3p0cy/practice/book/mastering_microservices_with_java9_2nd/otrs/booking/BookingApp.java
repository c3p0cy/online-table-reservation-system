package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class BookingApp {

  /**
   *
   * @param args
   */
  public static void main(String[] args) {
    SpringApplication.run(BookingApp.class, args);
  }

}
