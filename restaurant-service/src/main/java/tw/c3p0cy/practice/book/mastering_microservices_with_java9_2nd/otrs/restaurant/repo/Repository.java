package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.repo;

public interface Repository<TE, T> extends ReadOnlyRepository<TE, T> {

  void add(TE entity);

  void remove(T id);

  void update(TE entity);
}
