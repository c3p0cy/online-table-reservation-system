package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user.domain.repository;

import java.util.Collection;

/**
 *
 * @param <TE>
 * @param <T>
 */
public interface ReadOnlyRepository<TE, T> {

  // long Count;
  /**
   *
   * @param id
   * @return
   */
  boolean contains(T id);

  /**
   *
   * @param id
   * @return
   */
  TE get(T id);

  /**
   *
   * @return
   */
  Collection<TE> getAll();
}
