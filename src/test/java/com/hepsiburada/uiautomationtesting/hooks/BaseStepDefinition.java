package com.hepsiburada.uiautomationtesting.hooks;

import com.hepsiburada.uiautomationtesting.base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.Collection;

public class BaseStepDefinition extends TestBase {

    @Before
    public void setupDefinitions(Scenario scenario) throws InterruptedException {
        Collection<String> tags = scenario.getSourceTagNames();
        if (tags.contains("@Chrome")) {
            chromeSetup();
        } else if (tags.contains("@Firefox")) {
            firefoxSetup();
        } else if (tags.contains("@InternetExplorer")) {
            throw new UnsupportedOperationException();
        } else if (tags.contains("@Safari")) {
            throw new UnsupportedOperationException();
        } else {
            System.out.println("Platform name error!!");
        }
    }

    @After
    public void closeApp(Scenario scenario) {
        quitDriver();
    }
}
