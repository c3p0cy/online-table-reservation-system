package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo;

import java.util.Collection;

public interface ReadOnlyRepository<TE, T> {

  boolean contains(T id);

  TE get(T id);

  Collection<TE> getAll();
}
