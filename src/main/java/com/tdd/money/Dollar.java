package com.tdd.money;

class Dollar extends Money{
  Dollar(int amount) {
    this.amount = amount;
    currency = "USD";
  }
  Money times(int multiplier){
    return new Dollar(amount * multiplier);
  }
}
