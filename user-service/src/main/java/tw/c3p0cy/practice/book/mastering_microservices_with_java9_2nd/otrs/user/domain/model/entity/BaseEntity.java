package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.user.domain.model.entity;

/**
 *
 * @param <T>
 */
public abstract class BaseEntity<T> extends Entity<T> {

  private boolean isModified;

  /**
   *
   * @param id
   * @param name
   */
  public BaseEntity(T id, String name) {
    super.id = id;
    super.name = name;
    isModified = false;
  }

  /**
   *
   * @return
   */
  public boolean isIsModified() {
    return isModified;
  }

}
