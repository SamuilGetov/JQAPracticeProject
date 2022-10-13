package com.Tests;

import com.SetUp.driverSetUp;
import com.elementsLocators.homePageElements;
import org.junit.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.fail;

public class NegativeScenariosTests extends driverSetUp {


    @Test(priority = 1)
    public void emptyLogInFormTest() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        openWEBPage();
        homePageElements.logInButton(driver).click();
        Thread.sleep(5000);
        //TODO Assertion

    }

    @Test(priority = 2)
    public void invalidCredentialsTest() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        homePageElements.usernameField(driver).click();
        homePageElements.usernameField(driver).sendKeys("username");
        homePageElements.passwordField(driver).click();
        homePageElements.passwordField(driver).sendKeys("password");
        homePageElements.logInButton(driver).click();
        String alertWarning = homePageElements.logInAlertMessage(driver).getText();
        org.junit.Assert.assertEquals(homePageElements.invalidUsernamePasswordText, alertWarning);
    }

    @Test(priority = 3)
    public void emptyUsernameTest() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        homePageElements.passwordField(driver).click();
        homePageElements.passwordField(driver).sendKeys("password");
        homePageElements.logInButton(driver).click();
        //TODO Assertion

    }

    @Test(priority = 4)
    public void emptyPasswordTest() throws InterruptedException {
        System.out.println("Test Executed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        homePageElements.usernameField(driver).click();
        homePageElements.usernameField(driver).sendKeys("username");
        homePageElements.logInButton(driver).click();
        //TODO Assertion
    }

}
