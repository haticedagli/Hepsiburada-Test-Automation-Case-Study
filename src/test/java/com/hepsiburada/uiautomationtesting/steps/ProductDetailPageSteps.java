package com.hepsiburada.uiautomationtesting.steps;

import com.hepsiburada.uiautomationtesting.base.TestBase;
import com.hepsiburada.uiautomationtesting.pages.ProductDetailPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.util.Assert;

public class ProductDetailPageSteps extends TestBase {

    ProductDetailPage productDetailPage = new ProductDetailPage(webDriver);
    @And("Open product rating tab")
    public void openProductRatingTab() {
        productDetailPage.clickProductReviews();
    }

    @When("the yes button of the first product is clicked")
    public void theYesButtonOfTheFirstProductIsClicked() throws InterruptedException {
        productDetailPage.clickYesButtonOfFirstReview();
    }

    @Then("verify there is a message that says thank you")
    public void verifyItSays() {
        Assert.isTrue(productDetailPage.isThankYouSpanExists(), "Thank you span is not exists!");
    }

    @Then("verify that product has no review in it")
    public void verifyThatProductHasNoReviewInIt() {
        Assert.isTrue(productDetailPage.isNoReviewMessageExists(), "Review message is exists!");
    }
}
