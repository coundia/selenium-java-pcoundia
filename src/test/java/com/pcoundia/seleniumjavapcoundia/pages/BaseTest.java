package com.pcoundia.seleniumjavapcoundia.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeEach
    void setup() throws Exception {
        driver = WebDriverFactory.createWebDriver();
        homePage = new HomePage(driver);
    }

    @AfterEach
    void teardown() {
        WebDriverFactory.closeWebDriver(driver);
    }
}
