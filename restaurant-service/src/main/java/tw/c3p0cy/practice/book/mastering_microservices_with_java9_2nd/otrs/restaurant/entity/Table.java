package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity;

import java.math.BigInteger;

public class Table extends BaseEntity<BigInteger> {
  private int capacity;

  public Table(String name, BigInteger id, int capacity) {
    super(id, name);
    this.capacity = capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public int getCapacity() {
    return capacity;
  }

  @Override
  public String toString() {
    return String.format("{id: %s, name: %s, capacity: %s}", this.getId(), this.getName(),
        this.getCapacity());
  }
}
