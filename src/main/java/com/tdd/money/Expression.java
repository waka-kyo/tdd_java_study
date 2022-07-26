package com.tdd.money;

public interface Expression {
  Money reduce(Bank bank, String to);
}
