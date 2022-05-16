package com.nooobcoder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog dog;

    @BeforeEach
    void setUp() {
        dog = new Dog("Bobby", 2, "Labrador");
    }

    // Test the getters
    @Test
    void getName() {
        assertEquals("Bobby", dog.getName());
        assertEquals("Labrador", dog.getBreed());
        assertEquals(2, dog.getAge());
    }
}