package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.restaurant.entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends BaseEntity<String> {

  private List<Table> tables = new ArrayList<Table>();
  private String address;

  public Restaurant(String name, String id, String address, List<Table> tables) {
    super(id, name);
    this.tables = tables;
    this.address = address;
  }

  public void setTables(List<Table> tables) {
    this.tables = tables;
  }

  public List<Table> getTables() {
    return tables;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return String.format("{id: %s, name: %s, address: %s, tables: %s, isModified: %s}",
        this.getId(), this.getName(), this.getAddress(), this.getTables(), super.isIsModified());
  }

}
