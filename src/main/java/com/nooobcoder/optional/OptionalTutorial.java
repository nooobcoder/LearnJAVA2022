package com.nooobcoder.optional;

import com.nooobcoder.Cat;

import java.util.Optional;

public class OptionalTutorial {
  public static void main(String[] args) {
    Optional<Cat> optionalCat = findCatByName("Garfield");
    System.out.println(optionalCat.map(Cat::getAge).orElse(0));
  }

  public static Optional<Cat> findCatByName(String name) {
    Cat cat = new Cat(name, 3);
    return Optional.ofNullable(cat);
  }
}
