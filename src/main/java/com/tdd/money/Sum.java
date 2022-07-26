package com.tdd.money;

public class Sum implements Expression{
  Money augend;
  Money addend;
  Sum(Money augend, Money added){
    this.augend = augend;
    this.addend = added;
  }
  public Money reduce(Bank bank, String to) {
    int amount = augend.amount + addend.amount;
    return new Money(amount, to);
  }
}
