package com.tests;

import com.pages.page_elements;
import com.pages.page_home;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test_pages {

    WebDriver driver;
    page_elements pageElements;
    page_home pageHome;



    @BeforeTest
    public void loadTheHomePage() throws InterruptedException {
        // Will be run once before all other tests i.e. they will then inherit the driver
        pageHome = new page_home();
        pageElements = new page_elements();
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Samuil/JQAChromeDriver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(pageHome.getUrl());
        Thread.sleep(1000);
    }

    // Note that priority value is set as otherwise the tests will be run by name which will break the inheritance chain

    @Test(priority = 1)
    public void testTheHomePageUrl() throws InterruptedException {
        // Launch the home page, generate expected and actual URLs and compare them
        Thread.sleep(5000);
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
//        String expectedUrl = pageHome.getUrl()+"/";
//        Assert.assertEquals("[ERROR] Different than the expected URL!", expectedUrl, currentUrl);
    }

    @Test(priority = 2)
    public void testGoToElementsPage() throws InterruptedException {
        // Then click the Elements button and verify if the related page is loaded
        String expectedUrl = pageHome.getUrl() + pageElements.getPageUrl();
        pageHome.clickElementsButton(driver);
        Thread.sleep(1500);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("[ERROR] ", expectedUrl, currentUrl);
    }

    @Test(priority = 3)
    public void testGoToTextForm() throws InterruptedException {
        // Finally click on the text-box button on the Elements page and verify the text-form is loaded
        pageElements.clickTextBoxButton(driver);
        Thread.sleep(1500);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("[ERROR] ", "https://robotsparebinindustries.com/", currentUrl);
    }

    @AfterTest
    public void cleanup() {
        driver.quit();
    }
}
