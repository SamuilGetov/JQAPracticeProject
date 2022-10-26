package com.elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class loginCredentials {

    WebDriver driver;

    public loginCredentials(WebDriver driver) {
        this.driver = driver;
    }
    Duration timeout = Duration.ofSeconds(5);
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By logInButton = By.cssSelector(".btn");
    By logOutButton = By.id("logout");


     String username = "maria";
     String password = "thoushallnotpass";

    public void enterLogInCredentials() {
        driver.findElement(usernameField).click();
        driver.findElement(usernameField).clear();
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).click();
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(logInButton).click();
    }

    public void assertSuccessfulLogin() {
        new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(logOutButton));
        driver.findElement(logOutButton).isDisplayed();
    }


}
