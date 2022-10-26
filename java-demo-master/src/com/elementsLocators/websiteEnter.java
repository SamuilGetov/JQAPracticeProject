package com.elementsLocators;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class websiteEnter {

    public static String URLCredential = "https://robotsparebinindustries.com/#/";

    public void siteEntering(WebDriver driver) {
        driver.get(URLCredential);
        driver.manage().window().maximize();
    }
}


