package com.nooobcoder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {
    // Test the constructor
    @Test
    void testConstructor() {
        Cat cat = new Cat("Fluffy");
        assertEquals("Fluffy", cat.getName());
    }

    // Test the meow method
    @Test
    void testMeow() {
        Cat cat = new Cat("Fluffy");
        assertEquals("Fluffy meows!", cat.meow());
    }

    // Test the eat method
    @Test
    void testEat() {
        Cat cat = new Cat("Fluffy");
        assertEquals("Fluffy muches!", cat.eat());
    }

    // Test getters
    @Test
    void testGetters() {
        Cat cat = new Cat("Fluffy", 12, "brown", "asian");
        assertEquals("Fluffy", cat.getName());
        assertEquals(12, cat.getAge());
        assertEquals("brown", cat.getColor());
        assertEquals("asian", cat.getBreed());
    }
}