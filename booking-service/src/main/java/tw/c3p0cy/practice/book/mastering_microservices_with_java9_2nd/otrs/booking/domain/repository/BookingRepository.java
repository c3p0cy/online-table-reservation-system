package tw.c3p0cy.practice.book.mastering_microservices_with_java9_2nd.otrs.booking.domain.repository;

import java.util.Collection;

/**
 *
 * @param <Booking>
 * @param <String>
 */
public interface BookingRepository<Booking, String> extends Repository<Booking, String> {

  /**
   *
   * @param name
   * @return
   */
  boolean containsName(String name);

  /**
   *
   * @param name
   * @return
   * @throws Exception
   */
  public Collection<Booking> findByName(String name) throws Exception;
}
