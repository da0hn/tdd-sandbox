package me.gabriel.tddsandbox.shopping;

public class Item {
  private final double unitPrice;
  private final int quantity;

  public Item(final double unitPrice, final int quantity) {
    this.unitPrice = unitPrice;
    this.quantity = quantity;
  }

  double getSubtotal() {
    return this.getUnitPrice() * this.quantity;
  }

  public double getUnitPrice() {
    return this.unitPrice;
  }
}
