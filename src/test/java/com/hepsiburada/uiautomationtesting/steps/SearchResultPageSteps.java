package com.hepsiburada.uiautomationtesting.steps;

import com.hepsiburada.uiautomationtesting.base.TestBase;
import com.hepsiburada.uiautomationtesting.pages.SearchResultPage;
import io.cucumber.java.en.And;

public class SearchResultPageSteps extends TestBase {

    SearchResultPage searchResultPage = new SearchResultPage(webDriver);

    @And("Click on the first product that has rating stars on the page that opens")
    public void clickOnTheFirstProductOnThePageThatOpens() throws InterruptedException {
        searchResultPage.clickFirstProductThatHasReview();
    }

    @And("Click on the first product that has no rating stars on the page that opens")
    public void clickOnTheFirstProductThatHasNoRatingStarsOnThePageThatOpens() throws InterruptedException {
        searchResultPage.clickFirstProductThatHasNoReview();
    }
}
