package com.tdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MoneyTest {

  @Test
  public void testMultiplication(){
    Money five = Money.Dollar(5);
    assertEquals(Money.Dollar(10), five.times(2));
    assertEquals(Money.Dollar(15), five.times(3));
  }
  @Test
  public void testEquality() {
    assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
    assertFalse(Money.Dollar(5).equals(Money.Dollar(6)));
    assertTrue(new Franc(5).equals(new Franc(5)));
    assertFalse(new Franc(5).equals(new Franc(6)));
    assertFalse(new Franc(5).equals(Money.Dollar(5)));
  }
  @Test
  public void testFrancMultiplication(){
    Franc five = new Franc(5);
    assertEquals(new Franc(10), five.times(2));
    assertEquals(new Franc(15), five.times(3));
  }
}
