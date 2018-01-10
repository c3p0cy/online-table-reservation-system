package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.service;

import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo.ReadOnlyRepository;

/**
 *
 * @param <TE>
 * @param <T>
 */
public abstract class ReadOnlyBaseService<TE, T> {

  private ReadOnlyRepository<TE, T> repository;

  ReadOnlyBaseService(ReadOnlyRepository<TE, T> repository) {
    this.repository = repository;
  }
}
