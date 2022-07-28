package com.tdd.money;

public class Sum implements Expression{
  Expression augend;
  Expression addend;
  Sum(Expression augend, Expression added){
    this.augend = augend;
    this.addend = added;
  }
  Expression times(int multiplier) {
    return new Sum(augend.times(multiplier), addend.times(multiplier));
  }
  public Expression plus(Expression addend) {
    return new Sum(this, addend);
  }
  public Money reduce(Bank bank, String to) {
    int amount = augend.reduce(bank,to).amount + addend.reduce(bank,to).amount;
    return new Money(amount, to);
  }
}
