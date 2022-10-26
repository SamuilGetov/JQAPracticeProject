package com.SetUp;

import com.elementsLocators.homePageElements;
import com.elementsLocators.loggedAccElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class driverSetUp {

    public static WebDriver driver;
    public static homePageElements pageElements;
    public static homePageElements pageHome;

    @BeforeTest
    public void setUp()  {
        // Will be run once before all other tests i.e. they will then inherit the driver
        pageHome = new homePageElements();
        pageElements = new homePageElements();
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "C:/Users/Samuil/JQAChromeDriver/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(pageHome.getUrl());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void logInUserHappyPath() {
        homePageElements.usernameField(driver).click();
        homePageElements.usernameField(driver).sendKeys(homePageElements.username);
        homePageElements.passwordField(driver).click();
        homePageElements.passwordField(driver).sendKeys(homePageElements.password);
        homePageElements.logInButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='logout']")));
        loggedAccElements.logOutButton(driver).isDisplayed();
    }

    public  void checkProperAccName () {
        String accNameDisplayed = loggedAccElements.accNameDisplayed(driver).getText();
        Assert.assertEquals(accNameDisplayed,homePageElements.username);
    }

    public void firstNameLastNameFill() {
        loggedAccElements.firstNameField(driver).click();
        loggedAccElements.firstNameField(driver).sendKeys(loggedAccElements.firstName);
        loggedAccElements.lastNameField(driver).click();
        loggedAccElements.lastNameField(driver).sendKeys(loggedAccElements.lastName);

    }

    public void openWEBPage (){
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = pageHome.getUrl() + "#/";
        org.junit.Assert.assertEquals("[ERROR] Different than the expected URL!", expectedUrl, currentUrl);
        homePageElements.homeButton(driver).isDisplayed();
    }

//    @AfterTest
//    public void cleanup() {
//        driver.quit();
//    }
}
