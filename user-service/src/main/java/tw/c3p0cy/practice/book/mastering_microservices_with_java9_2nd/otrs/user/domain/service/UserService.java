package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user.domain.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user.domain.model.entity.Entity;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user.domain.model.entity.User;

/**
 *
 */
public interface UserService {

  /**
   *
   * @param booking
   * @throws Exception
   */
  public void add(User booking) throws Exception;

  /**
   *
   * @param booking
   * @throws Exception
   */
  public void update(User booking) throws Exception;

  /**
   *
   * @param id
   * @throws Exception
   */
  public void delete(String id) throws Exception;

  /**
   *
   * @param id
   * @return
   * @throws Exception
   */
  public Entity findById(String id) throws Exception;

  /**
   *
   * @param name
   * @return
   * @throws Exception
   */
  public Collection<User> findByName(String name) throws Exception;

  /**
   *
   * @param name
   * @return
   * @throws Exception
   */
  public Collection<User> findByCriteria(Map<String, ArrayList<String>> name) throws Exception;
}
