package com.hepsiburada.uiautomationtesting.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultPage extends PageBase{

    public SearchResultPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickFirstProductThatHasReview() throws InterruptedException {
        for(int i=0; i<10; i++){
            WebElement element = driver.findElement(By.id(String.format("i%d", i)));
            scrollIntoView(element);
            List<WebElement> reviewStars = element.findElements(By.cssSelector("*[data-test-id='review']"));
            if(!reviewStars.isEmpty()){
                clickFunction(element);
                break;
            }
        }
        switchTab();
    }

    public void clickFirstProductThatHasNoReview() throws InterruptedException {
        for(int i=0; i<10; i++){
            WebElement element = driver.findElement(By.id(String.format("i%d", i)));
            scrollIntoView(element);
            List<WebElement> reviewStars = element.findElements(By.cssSelector("*[data-test-id='review']"));
            if(reviewStars.isEmpty()){
                clickFunction(element);
                break;
            }
        }
        switchTab();
    }
}


