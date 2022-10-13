package com.Tests;

import com.SetUp.driverSetUp;
import com.elementsLocators.orderRobotElements;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrderRobotTests extends driverSetUp {

    @Test(priority = 1)
    public void enterRobotOrderPage() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        openWEBPage();
        orderRobotElements.orderRobotButton(driver).click();
        orderRobotElements.yupButton(driver).isDisplayed();
        orderRobotElements.iGuessSoButton(driver).isDisplayed();
        orderRobotElements.noWayButton(driver).isDisplayed();
        orderRobotElements.OKButton(driver).click();
    }

    @Test(priority = 2)
    public void simpleRobotBuild() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        //Chose Head option
        orderRobotElements.robotHeadDropdown(driver).click();
        Thread.sleep(2000);
        orderRobotElements.rollAThorHead(driver).click();
        //TODO Check the other options

        //radio buttons check
        int radioButtonsCount = driver.findElements(By.cssSelector("input[type='radio']")).size();
        Assert.assertEquals(radioButtonsCount, 6);
        driver.findElements(By.cssSelector("input[type='radio']")).get(1).click();

        //legs number check (min 1- max 6)
        //TODO TC for checking min-max values

        //orderRobotElements.legsNumberField(driver).click();
        orderRobotElements.legsNumberField(driver).sendKeys("2");
        orderRobotElements.shippingAddressField(driver).click();
        orderRobotElements.shippingAddressField(driver).sendKeys(orderRobotElements.shippingAddress);
        orderRobotElements.previewButton(driver).click();
        orderRobotElements.robotImage(driver).isDisplayed();
        orderRobotElements.showHideModelInfoButton(driver).click();
        orderRobotElements.modelInfoTable(driver).isDisplayed();

    }
    @Test(priority = 3,dependsOnMethods = "simpleRobotBuild")
    public void placeAnOrder() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        orderRobotElements.orderButton(driver).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"receipt\"]")));
        orderRobotElements.receipt(driver).isDisplayed();
        orderRobotElements.orderAnotherRobotButton(driver).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='order']")));
        orderRobotElements.orderButton(driver).isDisplayed();
    }
}






