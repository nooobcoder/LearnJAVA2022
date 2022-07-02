package com.nooobcoder;


import com.nooobcoder.annotations.ImportantString;
import com.nooobcoder.annotations.RunImmediately;
import com.nooobcoder.annotations.VeryImportant;

/**
 * Created by nooobcoder on 12/3/15.
 * This is a class for cat
 *
 * @author nooobcoder
 * @version 1.0
 */
@VeryImportant
public class Cat {
  @ImportantString
  private String name;
  private int age;
  private String color;
  private String breed;

  public Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Cat(String name, int age, String color, String breed) {
    this.name = name;
    this.age = age;
    this.color = color;
    this.breed = breed;
  }

  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getColor() {
    return color;
  }

  public String getBreed() {
    return breed;
  }

  @RunImmediately(times = 3)
  public String meow() {
    return name + " meows!";
  }

  public String eat() {
    return name + " muches!";
  }
}
