package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.service;

import java.util.Collection;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo.Repository;

public abstract class BaseService<TE, T> extends ReadOnlyBaseService<TE, T> {

  private Repository<TE, T> _repository;

  BaseService(Repository<TE, T> repository) {
    super(repository);
    _repository = repository;
  }

  /**
   *
   * @param entity
   * @throws Exception
   */
  public void add(TE entity) throws Exception {
    _repository.add(entity);
  }

  /**
   *
   * @return
   */
  public Collection<TE> getAll() {
    return _repository.getAll();
  }

  public Repository<TE, T> getRepository() {
    return _repository;
  }


}
