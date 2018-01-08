package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.vo;

import java.util.ArrayList;
import java.util.List;
import tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity.Table;

public class RestaurantVO {

  private List<Table> tables = new ArrayList<>();
  private String name;
  private String id;
  private String address;

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RestaurantVO() {}

  public void setTables(List<Table> tables) {
    this.tables = tables;
  }

  public List<Table> getTables() {
    return tables;
  }

  /**
   * Overridden toString() method that return String presentation of the Object
   *
   * @return
   */
  @Override
  public String toString() {
    return String.format("{id: %s, name: %s, address: %s, tables: %s}", this.getId(),
        this.getName(), this.getAddress(), this.getTables());
  }

}
