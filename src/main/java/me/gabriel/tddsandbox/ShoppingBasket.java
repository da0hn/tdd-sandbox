package me.gabriel.tddsandbox;

import java.util.List;

public class ShoppingBasket {

  private final List<Item> items;

  public ShoppingBasket(List<Item> items) {
    this.items = items;
  }

  public double getTotal() {
    if(this.items.isEmpty()) return 0.0;
    return this.items.stream()
      .mapToDouble(Item::getSubtotal)
      .sum();
  }

}
