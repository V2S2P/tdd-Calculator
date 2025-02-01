package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {
    Calc calc = new Calc();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    @DisplayName("Test1")
    void calcTest1(){
        int expected = 10;
        int actual = calc.addition(5,5);
        assertEquals(expected, actual);
    }
}