package com.tdd.money;

class Dollar extends Money{

  Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multiplier){
    return new Dollar(amount * multiplier);
  }

  public boolean equals(Object object) {
    Money dollar = (Money) object;
    return amount == dollar.amount;
  }
}
