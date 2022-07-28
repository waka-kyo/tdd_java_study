package com.tdd.money;

public class Money implements Expression{
  protected int amount;
  protected String currency;
  Money(int amount, String currency) {
    this.amount = amount;
    this.currency = currency;
  }
  public Expression times(int multiplier){
    return new Money(amount * multiplier, currency);
  };
  String currency(){
    return currency;
  };
  public boolean equals(Object object) {
    Money money = (Money) object;
    return amount == money.amount
        && currency().equals(money.currency());
  }
  public String toString() {
    return amount + " " + currency;
  }
  static Money dollar(int amount) {
    return new Money(amount, "USD");
  }
  static Money franc(int amount) {
    return new Money(amount, "CHF");
  }
  public Expression plus(Expression added) {
    return new Sum(this, added);
  }
  public Money reduce(Bank bank, String to) {
    int rate = bank.rate(currency, to);
    return new Money(amount / rate, to);
  }
}
