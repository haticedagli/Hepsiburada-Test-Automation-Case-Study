package com.hepsiburada.uiautomationtesting.hooks;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"classpath:features"},
        glue = {"com.hepsiburada"},
        monochrome=true,
        plugin = {"pretty", "html:target/cucumber"}
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests { }




