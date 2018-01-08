package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo;

import java.util.Collection;

public interface RestaurantRepository<Restaurant, String> extends Repository<Restaurant, String> {

  boolean containsName(String name) throws Exception;

  Collection<Restaurant> findByName(String name) throws Exception;
}
