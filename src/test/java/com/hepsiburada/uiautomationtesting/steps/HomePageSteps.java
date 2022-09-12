package com.hepsiburada.uiautomationtesting.steps;

import com.hepsiburada.uiautomationtesting.base.TestBase;
import com.hepsiburada.uiautomationtesting.pages.HomePage;
import io.cucumber.java.en.And;

public class HomePageSteps extends TestBase {

    HomePage homePage = new HomePage(webDriver);
    @And("Search {string} in search box")
    public void searchIphoneProductInSearchBox(String arg0) {
        homePage.searchValueOnSearchBox(arg0);
    }

    @And("Click search button")
    public void clickSearchButton() {
        homePage.clickSearchButton();
    }
}
