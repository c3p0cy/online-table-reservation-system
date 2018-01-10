package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity;

public abstract class BaseEntity<T> extends Entity<T> {

  private boolean isModified;

  public BaseEntity(T id, String name) {
    super.setId(id);
    super.setName(name);
    isModified = false;
  }

  public boolean isIsModified() {
    return isModified;
  }

}
