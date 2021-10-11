package me.gabriel.tddsandbox;

import me.gabriel.tddsandbox.donatemovie.Library;
import me.gabriel.tddsandbox.donatemovie.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DonateMovieTest {

  private Movie movie;
  private Library library;

  @BeforeEach
  void setUp() {
    this.library = new Library();
    this.movie = new Movie();
  }

  @Test
  @Tag("unit")
  void movieAddedToCatalogue() {
    this.library.donate(this.movie);
    assertTrue(this.library.contains(this.movie));
  }

  @Test
  @Tag("unit")
  void rentalCopyAdded() {
    this.library.donate(this.movie);
    assertEquals(1, this.movie.getCopies());
  }

}
