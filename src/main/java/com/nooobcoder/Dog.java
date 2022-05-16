package com.nooobcoder;

/**
 * Created by nooobcoder on 12/3/15.
 * This is a class for dog
 *
 * @author nooobcoder
 * @version 1.0
 */
public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }
}
