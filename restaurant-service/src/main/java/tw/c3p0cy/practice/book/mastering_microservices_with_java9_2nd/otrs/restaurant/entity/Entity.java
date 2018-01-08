package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity;

public abstract class Entity<T> {

  private T id;
  private String name;

  public T getId() {
    return id;
  }

  public void setId(T id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
