package com.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;

import static org.junit.Assert.assertEquals;

public class stepone {
    @Given("i multiple two numbers")
    public void iMultipleTwoNumbers() {
        assertEquals(50, 25 * 2);
    }

    @Given("i add two numbers")
    public void iAddTwoNumbers() {
        assertEquals(20, 15 + 5);
    }
}
