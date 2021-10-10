package me.gabriel.tddsandbox;


import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingBasketTest {

  @Test
  public void totalOfEmptyBasket() {
    var basket = this.buildBasketWithItems();
    assertEquals(0.0, basket.getTotal(), 0.0);
  }

  private ShoppingBasket buildBasketWithItems(Item... items) {
    return new ShoppingBasket(asList(items));
  }

  @Test
  public void totalOfItemWithQuantityTwo() {
    var basket = this.buildBasketWithItems(
      new Item(100.0, 2)
    );
    assertEquals(200.0, basket.getTotal(), 0.0);
  }

  @Test
  public void totalOfSingleItem() {
    var basket = this.buildBasketWithItems(new Item(100.0, 1));
    assertEquals(100.0, basket.getTotal(), 0.0);
  }

  @Test
  public void totalOfTwoItems() {
    var basket = this.buildBasketWithItems(
      new Item(100.0, 1),
      new Item(200.0, 1)
    );
    assertEquals(300.0, basket.getTotal(), 0.0);
  }
}
