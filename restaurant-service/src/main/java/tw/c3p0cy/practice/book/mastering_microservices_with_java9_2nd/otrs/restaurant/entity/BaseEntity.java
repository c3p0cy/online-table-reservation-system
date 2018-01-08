package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity;

public abstract class BaseEntity<T> extends Entity<T> {

  private boolean isModified;

  public BaseEntity(T id, String name) {
    super.setId(id);
    super.setName(name);
  }

  public boolean isModified() {
    return isModified;
  }

  public void setModified(boolean isModified) {
    this.isModified = isModified;
  }

}
