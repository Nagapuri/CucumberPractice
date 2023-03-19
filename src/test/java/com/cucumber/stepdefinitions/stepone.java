package com.cucumber.stepdefinitions;

import io.cucumber.java.en.Given;
import static org.junit.Assert.assertEquals;

public class stepone {
    @Given("i multiple two numbers")
    public void iMultipleTwoNumbers() {
        assertEquals(110,25*2);
    }
}
