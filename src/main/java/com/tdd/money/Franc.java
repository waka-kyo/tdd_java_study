package com.tdd.money;

public class Franc extends Money{

  Franc(int amount) {
    this.amount = amount;
  }
  String currency() {
    return "CHF";
  }
  Money times(int multiplier){
    return new Franc(amount * multiplier);
  }
}
