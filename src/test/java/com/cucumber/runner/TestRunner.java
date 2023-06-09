package com.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.cucumber.stepdefinitions",
        plugin = {"pretty","html:target/cucumber-report.html","json:target/cucumber/cucumber.json"},
        tags = "@smoke",
        monochrome = false)

public class TestRunner {
}
