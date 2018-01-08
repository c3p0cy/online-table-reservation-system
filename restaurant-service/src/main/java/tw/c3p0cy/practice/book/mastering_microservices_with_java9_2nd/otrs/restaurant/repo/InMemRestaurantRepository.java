package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Entity;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Restaurant;

public class InMemRestaurantRepository implements RestaurantRepository<Restaurant, String> {

  private Map<String, Restaurant> entities;

  public InMemRestaurantRepository() {
    entities = new HashMap<String, Restaurant>();
    Restaurant restaurant = new Restaurant("Big-O Restaurant", "1", null);
    entities.put("1", restaurant);
    restaurant = new Restaurant("O Restaurant", "2", null);
    entities.put("2", restaurant);
  }

  @Override
  public void add(Restaurant entity) {
    entities.put(entity.getId(), entity);
  }

  @Override
  public void remove(String id) {
    entities.remove(id);
  }

  @Override
  public void update(Restaurant entity) {
    entities.put(entity.getId(), entity);
  }

  @Override
  public boolean contains(String id) {
    return entities.containsKey(id);
  }

  @Override
  public Entity<String> get(String id) {
    return entities.get(id);
  }

  @Override
  public Collection<Restaurant> getAll() {
    return entities.values();
  }

  @Override
  public boolean containsName(String name) throws Exception {
    return !this.findByName(name).isEmpty();
  }

  @Override
  public Collection<Restaurant> findByName(String name) throws Exception {
    String lowercaseName = name.toLowerCase();
    return entities.values().stream().filter(e -> e.getName().toLowerCase().contains(lowercaseName))
        .collect(Collectors.toList());
  }

}
