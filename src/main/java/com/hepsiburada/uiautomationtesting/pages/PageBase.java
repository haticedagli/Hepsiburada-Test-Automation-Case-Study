package com.hepsiburada.uiautomationtesting.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public abstract class PageBase {

    public final WebDriver driver;
    private final WebDriverWait wait;

    public PageBase(WebDriver webDriver){
        driver = webDriver;
        wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver,this);
    }

    public void clickFunction(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement, String value){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void switchTab(){
        //Get the current window handle
        String windowHandle = driver.getWindowHandle();
        //Get the list of window handles
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());
        tabs.remove(windowHandle);
        //Use the list of window handles to switch between windows
        driver.switchTo().window(tabs.get(0));
    }

    public void scrollIntoView(WebElement element) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
    }
}
