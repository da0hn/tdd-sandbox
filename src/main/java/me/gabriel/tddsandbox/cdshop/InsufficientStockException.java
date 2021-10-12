package me.gabriel.tddsandbox.cdshop;

public class InsufficientStockException extends RuntimeException {
  public InsufficientStockException() {
  }

  public InsufficientStockException(final String message) {
    super(message);
  }
}
