package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Entity;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Restaurant;

public interface RestaurantService {

  public void add(Restaurant restaurant) throws Exception;

  public void update(Restaurant restaurant) throws Exception;

  public void delete(String id) throws Exception;

  public Entity<String> findById(String restaurantId) throws Exception;

  public Collection<Restaurant> findByName(String name) throws Exception;

  public Collection<Restaurant> findByCriteria(Map<String, ArrayList<String>> name)
      throws Exception;

}
