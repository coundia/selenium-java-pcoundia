package com.pcoundia.seleniumjavapcoundia.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }

    public void navigateToHomePage() {
        driver.get("https://www.pcoundia.com");
    }

    public boolean isTitleCorrect() {
        return getPageTitle().contains("Papa Coundiqa");
    }
}
