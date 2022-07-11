package com.tdd.money;

class Dollar extends Money{
  private String currency;
  Dollar(int amount) {
    this.amount = amount;
    currency = "USD";
  }
  String currency() {
    return currency;
  }
  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }
}
