package com.vsee.qa.challenge.mobile.testng.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SendAnEmail",
        features = "classpath:features",
        glue = {"com.vsee.qa.challenge.mobile.common", "com.vsee.qa.challenge.mobile.stepdefinitions", "com.vsee.qa.challenge.mobile.testng.runner"},
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports/cucumberreport.html"},
        monochrome = true
)
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
