package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.zuul.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class EdgeApp {

  public static void main(String[] args) {
    SpringApplication.run(EdgeApp.class, args);
  }

}
