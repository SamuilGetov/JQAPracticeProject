package com.Tests;

import com.SetUp.driverSetUp;
import com.elementsLocators.homePageElements;
import com.elementsLocators.loggedAccElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

public class HomeLoginTests extends driverSetUp {


    @Test(priority = 1)
    public void testTheHomePageUrl() throws InterruptedException {
        // Launch the home page, generate expected and actual URLs and compare them
        Thread.sleep(5000);
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = pageHome.getUrl() + "#/";
        Assert.assertEquals("[ERROR] Different than the expected URL!", expectedUrl, currentUrl);
        homePageElements.homeButton(driver).isDisplayed();
        //TODO verify the logo
    }

    @Test(priority = 2)
    public void loginForm() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        logInUserHappyPath();
        checkProperAccName();
    }

    @Test(priority = 3)
    public void enterSimpleSalesCredentials() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        firstNameLastNameFill();
        loggedAccElements.salesResultField(driver).click();
        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultPositive);
        loggedAccElements.submitButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-info btn-secondary']")));
        loggedAccElements.performanceButton(driver).click();
        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
        Assert.assertEquals(loggedAccElements.positivePerformanceFeedback, performanceInfoText);
        loggedAccElements.deleteAllSalesEntries(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        try {
            loggedAccElements.deleteAllSalesEntries(driver);
            fail("All entries not deleted!");
        } catch (NoSuchElementException ex) {
        }
    }

    @Test(priority = 4)
    public void enterLowSalesCredentials() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        firstNameLastNameFill();
        loggedAccElements.salesResultField(driver).click();
        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultLow);
        loggedAccElements.submitButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-info btn-secondary']")));
        loggedAccElements.performanceButton(driver).click();
        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
        Assert.assertEquals(loggedAccElements.lowPerformanceFeedback, performanceInfoText);
        loggedAccElements.deleteAllSalesEntries(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        try {
            loggedAccElements.deleteAllSalesEntries(driver);
            fail("All entries not deleted!");
        } catch (NoSuchElementException ex) {
        }
    }

    @Test(priority = 5)
    public void enterNegativeSalesCredentials() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        firstNameLastNameFill();
        loggedAccElements.salesResultField(driver).click();
        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultNegative);
        loggedAccElements.submitButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-info btn-secondary']")));
        loggedAccElements.performanceButton(driver).click();
        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
        Assert.assertEquals(loggedAccElements.negativePerformanceFeedback, performanceInfoText);
        loggedAccElements.deleteAllSalesEntries(driver).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(5000);
        try {
            loggedAccElements.deleteAllSalesEntries(driver);
            fail("All entries not deleted!");
        } catch (NoSuchElementException ex) {
        }
    }

    @Test(priority = 6)
    public void checkSalesTargetValues() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        //TODO
    }

    @Test(priority = 7)
    public void logOutTest() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        loggedAccElements.logOutButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
    }

}


