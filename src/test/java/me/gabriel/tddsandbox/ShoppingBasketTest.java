package me.gabriel.tddsandbox;


import me.gabriel.tddsandbox.shopping.Item;
import me.gabriel.tddsandbox.shopping.ShoppingBasket;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingBasketTest {

  @Test
  @Tag("unit")
  void totalOfEmptyBasket() {
    final var basket = this.buildBasketWithItems();
    assertEquals(0.0, basket.getTotal(), 0.0);
  }

  private ShoppingBasket buildBasketWithItems(final Item... items) {
    return new ShoppingBasket(asList(items));
  }

  @Test
  @Tag("unit")
  void totalOfItemWithQuantityTwo() {
    final var basket = this.buildBasketWithItems(
      new Item(100.0, 2)
    );
    assertEquals(200.0, basket.getTotal(), 0.0);
  }

  @Test
  @Tag("unit")
  void totalOfSingleItem() {
    final var basket = this.buildBasketWithItems(new Item(100.0, 1));
    assertEquals(100.0, basket.getTotal(), 0.0);
  }

  @Test
  @Tag("unit")
  void totalOfTwoItems() {
    final var basket = this.buildBasketWithItems(
      new Item(100.0, 1),
      new Item(200.0, 1)
    );
    assertEquals(300.0, basket.getTotal(), 0.0);
  }
}
