package com.hepsiburada.uiautomationtesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductDetailPage extends PageBase{

    @FindBy(id = "productReviews")
    private WebElement productReviews;

    public ProductDetailPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickProductReviews(){
        clickFunction(productReviews);
    }

    public void clickYesButtonOfFirstReview() throws InterruptedException {
        List<WebElement> yesButtons = driver.findElements(By.className("thumbsUp"));
        WebElement firstYesButton = yesButtons.stream().findFirst().orElseThrow();
        scrollIntoView(firstYesButton);
        clickFunction(firstYesButton);
    }

    public boolean isThankYouSpanExists(){
        List<WebElement> webElements = driver.findElements(By.xpath("//*[text()='Teşekkür Ederiz.']"));
        return !webElements.isEmpty();
    }

    public boolean isNoReviewMessageExists(){
        List<WebElement> webElements = driver.findElements(By.xpath("//*[text()='Henüz değerlendirilmemiş']"));
        return !webElements.isEmpty();
    }
}
