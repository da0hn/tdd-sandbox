package me.gabriel.tddsandbox.cdshop;

public class CompactDisc {
  private int stock;

  public CompactDisc(final int initialStock) {
    this.stock = initialStock;
  }

  public int getStockCount() {
    return this.stock;
  }

  public void buy(final int quantity) {
    if(quantity < 0) {
      throw new InvalidQuantityException();
    }
    if(quantity > this.stock) {
      throw new InsufficientStockException();
    }
    this.stock -= quantity;
  }
}
