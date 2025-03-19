package com.pcoundia.seleniumjavapcoundia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WebDriverFactory {

    public static WebDriver createWebDriver() throws MalformedURLException {
        URL seleniumGridUrl = new URL("http://localhost:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(seleniumGridUrl, new ChromeOptions());
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        return driver;
    }

    public static void closeWebDriver(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
