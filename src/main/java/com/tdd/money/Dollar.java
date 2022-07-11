package com.tdd.money;

class Dollar extends Money{

  Dollar(int amount) {
    this.amount = amount;
  }
  String currency() {
    return "USD";
  }
  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }
}
