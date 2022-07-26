package com.tdd.money;

public class Bank {
  Money reduce(Expression source, String to) {
    return source.reduce(to);
  }
  void addRate(String from, String to, int rate) {
  }
}
