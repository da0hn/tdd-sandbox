package me.gabriel.tddsandbox;


import me.gabriel.tddsandbox.cdshop.CompactDisc;
import me.gabriel.tddsandbox.cdshop.InsufficientStockException;
import me.gabriel.tddsandbox.cdshop.InvalidQuantityException;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CdTest {


  @Nested
  @Tags({@Tag("unit"), @Tag("cd")})
  class BuyCd {
    @Test
    void cdIsInStock() {
      final var cd = new CompactDisc(10);
      cd.buy(1);
      assertEquals(9, cd.getStockCount());
    }

    @Test
    void insufficientStock() {
      final var cd = new CompactDisc(0);
      assertThrows(
        InsufficientStockException.class,
        () -> cd.buy(1)
      );
    }

    @Test
    void invalidQuantity() {
      final var cd = new CompactDisc(10);
      assertThrows(
        InvalidQuantityException.class,
        () -> cd.buy(-1)
      );
    }

  }

}
