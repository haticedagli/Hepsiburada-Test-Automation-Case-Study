package com.hepsiburada.uiautomationtesting.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

    @FindBy(className = "desktopOldAutosuggestTheme-input")
    private WebElement searchBox;

    @FindBy(className = "SearchBoxOld-buttonContainer")
    private WebElement searchButton;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void searchValueOnSearchBox(String value){
        sendKeysFunction(searchBox, value);
    }

    public void clickSearchButton(){
        clickFunction(searchButton);
    }

}
