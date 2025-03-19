package com.pcoundia.seleniumjavapcoundia;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SeleniumJavaPcoundiaApplicationTests {

    @Test
    void testPcoundiaHomePage() {
        homePage.navigateToHomePage();
        assertTrue(homePage.isTitleCorrect(), "Papa Coundia title is not present");
    }

}
