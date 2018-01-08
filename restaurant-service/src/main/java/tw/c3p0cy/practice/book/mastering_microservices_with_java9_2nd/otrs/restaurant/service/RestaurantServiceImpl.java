package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Entity;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Restaurant;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo.RestaurantRepository;

@Service("restaurantService")
public class RestaurantServiceImpl extends BaseService<Restaurant, String>
    implements RestaurantService {

  @Autowired
  public RestaurantServiceImpl(RestaurantRepository<Restaurant, String> restaurantRepository) {
    super(restaurantRepository);
  }

  @Override
  public void add(Restaurant restaurant) throws Exception {
    if (repo().containsName(restaurant.getName())) {
      throw new Exception(
          String.format("There is already a product with the name - %s", restaurant.getName()));
    }

    if (restaurant.getName() == null || "".equals(restaurant.getName())) {
      throw new Exception("Restaurant name cannot be null or empty string.");
    }
    super.add(restaurant);

  }

  @Override
  public void update(Restaurant restaurant) throws Exception {
    repo().update(restaurant);
  }

  @Override
  public void delete(String id) throws Exception {
    repo().remove(id);
  }

  @Override
  public Entity<String> findById(String restaurantId) throws Exception {
    return repo().get(restaurantId);
  }

  @Override
  public Collection<Restaurant> findByName(String name) throws Exception {
    return repo().findByName(name);
  }

  @Override
  public Collection<Restaurant> findByCriteria(Map<String, ArrayList<String>> name)
      throws Exception {
    throw new UnsupportedOperationException("Not supported yet."); // To change body of generated
                                                                   // methods, choose Tools |
                                                                   // Templates.
  }

  private RestaurantRepository<Restaurant, String> repo() {
    return (RestaurantRepository<Restaurant, String>) super.getRepository();
  }
}
