package com.cucumberpom.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/main/java/com/cucumber/features", // Path to your feature files
    glue = "src/main/java/com/cucumber/stepdefinitions" // Package where your step definitions are located
)
public class TestRunner {
}

