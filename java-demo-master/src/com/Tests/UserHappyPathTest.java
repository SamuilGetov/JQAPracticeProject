package com.Tests;

import com.elementsLocators.loginCredentials;
import com.elementsLocators.websiteEnter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserHappyPathTest {

    WebDriver driver;

    String currURL = "";

    @BeforeTest
    public void EnteringTheWebsite() {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Samuil/JQAChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        new websiteEnter().siteEntering(driver);
    }

    @Test(priority = 1)
    public void testTheHomePageUrl() {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        currURL = driver.getCurrentUrl();
        Assert.assertEquals(currURL, websiteEnter.URLCredential);

    }

    @Test(priority = 2)
    public void makeSuccessfulLogIn() {

        loginCredentials loginCredentials = new loginCredentials(driver);
        loginCredentials.enterLogInCredentials();
        loginCredentials.assertSuccessfulLogin();
    }
}
