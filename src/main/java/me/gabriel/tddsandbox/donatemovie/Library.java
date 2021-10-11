package me.gabriel.tddsandbox.donatemovie;

import java.util.HashSet;
import java.util.Set;

public class Library {

  private final Set<Movie> catalogue = new HashSet<>();

  public void donate(final Movie movie) {
    this.catalogue.add(movie);
    movie.addCopy();
  }

  public boolean contains(final Movie movie) {
    return this.catalogue.contains(movie);
  }
}
