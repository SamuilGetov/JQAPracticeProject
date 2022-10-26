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

    private By performanceButtonLocator = By.xpath("//button[@class='btn btn-info btn-secondary']");
    private By salesNamesTableLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[1]");
    private By salesTargetTableLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[2]");
    private By salesTargetTableValueLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[2]/text()[2]");
    private By salesResultTableLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[3]");
    private By salesResultTableValueLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[3]/text()[2]");
    private By differenceTableLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[4]");
    private By differenceValueTableLocator = By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr/td[4]/text()[2]");


    @Test(priority = 1)
    public void testTheHomePageUrl() throws InterruptedException {
        // Launch the home page, generate expected and actual URLs and compare them
        Thread.sleep(5000);
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);
        String expectedUrl = pageHome.getUrl() + "#/";
        Assert.assertEquals("[ERROR] Different than the expected URL!", expectedUrl, currentUrl);

        //TODO verify the logo
    }

    @Test(priority = 2)
    public void loginForm()   {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        logInUserHappyPath();
        checkProperAccName();
    }

//    @Test(priority = 3)
//    public void enterLowSalesCredentials() throws InterruptedException {
//        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//        firstNameLastNameFill();
//        loggedAccElements.salesResultField(driver).click();
//        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultLow);
//        loggedAccElements.submitButton(driver).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(performanceButtonLocator));
//        loggedAccElements.performanceButton(driver).click();
//        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
//        Assert.assertEquals(loggedAccElements.lowPerformanceFeedback, performanceInfoText);
//        loggedAccElements.deleteAllSalesEntries(driver).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(5000);
//        try {
//            loggedAccElements.deleteAllSalesEntries(driver);
//            fail("All entries not deleted!");
//        } catch (NoSuchElementException ex) {
//        }
//    }
//
//    @Test(priority = 4)
//    public void enterNegativeSalesCredentials() throws InterruptedException {
//        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//        firstNameLastNameFill();
//        loggedAccElements.salesResultField(driver).click();
//        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultNegative);
//        loggedAccElements.submitButton(driver).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(performanceButtonLocator));
//        loggedAccElements.performanceButton(driver).click();
//        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
//        Assert.assertEquals(loggedAccElements.negativePerformanceFeedback, performanceInfoText);
//        loggedAccElements.deleteAllSalesEntries(driver).click();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(5000);
//        try {
//            loggedAccElements.deleteAllSalesEntries(driver);
//            fail("All entries not deleted!");
//        } catch (NoSuchElementException ex) {
//        }
//    }
//
//    @Test(priority = 5)
//    public void enterSimpleSalesCredentials() throws InterruptedException {
//        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//        firstNameLastNameFill();
//        loggedAccElements.salesResultField(driver).click();
//        loggedAccElements.salesResultField(driver).sendKeys(loggedAccElements.salesResultPositive);
//        loggedAccElements.submitButton(driver).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(performanceButtonLocator));
//        loggedAccElements.performanceButton(driver).click();
//        String performanceInfoText = loggedAccElements.performanceInfo(driver).getText();
//        Assert.assertEquals(loggedAccElements.positivePerformanceFeedback, performanceInfoText);
//    }
//
//    @Test(priority = 6)
//    public void checkSalesTargetValuesSingleSale() throws InterruptedException {
//        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//
//        String salesTargetDefaultText = "$5,000"; //TODO find a way to locate selected value
//        int salesTargetDefaultValue = 5000;
//
//        String namesDisplayedInTable = driver.findElement(salesNamesTableLocator).getText();
//        Assert.assertEquals(namesDisplayedInTable, (loggedAccElements.firstName) + " " + (loggedAccElements.lastName));
//
//        String targetDisplayedInTable = driver.findElement(salesTargetTableLocator).getText();
//        Assert.assertEquals(targetDisplayedInTable, salesTargetDefaultText);
//
//        String resultDisplayedInTable = driver.findElement(salesResultTableValueLocator).getText();
//        int intResultDisplayed = Integer.parseInt(resultDisplayedInTable);
//        System.out.println(intResultDisplayed);
//
//
//        String differenceDisplayedInTable = driver.findElement(differenceTableLocator).getText();
//        System.out.println(differenceDisplayedInTable);
//    }


//    @Test(priority = 7)
//    public void logOutTest() throws InterruptedException {
//        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//        loggedAccElements.logOutButton(driver).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
//    }

}


