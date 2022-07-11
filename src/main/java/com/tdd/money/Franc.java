package com.tdd.money;

public class Franc extends Money{
  private String currency;
  Franc(int amount) {
    this.amount = amount;
    currency = "CHF";
  }
  String currency() {
    return currency;
  }
  Money times(int multiplier){
    return new Franc(amount * multiplier);
  }
}
