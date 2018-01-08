package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.service;

import java.util.Collection;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo.Repository;

public abstract class BaseService<TE, T> {

  private Repository<TE, T> repository;

  BaseService(Repository<TE, T> repository) {
    this.repository = repository;
  }

  public Repository<TE, T> getRepository() {
    return repository;
  }

  /**
   *
   * @param entity
   * @throws Exception
   */
  public void add(TE entity) throws Exception {
    repository.add(entity);
  }

  /**
   *
   * @return
   */
  public Collection<TE> getAll() {
    return repository.getAll();
  }

}
