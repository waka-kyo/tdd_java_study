package com.tdd.money;

import java.util.HashMap;
import java.util.Map;

public class Bank {
  private Map<Pair, Integer> rates = new HashMap<>();
  Money reduce(Expression source, String to) {
    return source.reduce(this, to);
  }
  void addRate(String from, String to, int rate) {
    rates.put(new Pair(from, to), rate);
  }
  int rate(String from, String to) {
    return rates.get(new Pair(from, to));
  }
}
