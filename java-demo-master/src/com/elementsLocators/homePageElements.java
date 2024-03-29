package com.elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageElements {

    private String baseUrl = "https://robotsparebinindustries.com/";
    public static String username = "maria";
    public static String password = "thoushallnotpass";
    public static String invalidUsernamePasswordText = "Invalid username or password.";

    public static String homeButtonLocator = "//a[.='Home']";
    public static String usernameFieldLocator = "#username";
    public static String passwordFieldLocator = "password";
    public static String logInButtonLocator = ".btn";
    public static String logInAlertMessageLocator = "//div[@class='alert alert-warning']";


    public String getUrl() {
        return baseUrl;
    }


    public static WebElement homeButton(WebDriver driver) {
        return driver.findElement(By.xpath(homeButtonLocator));
    }

    public static WebElement usernameField(WebDriver driver) {
        return driver.findElement(By.cssSelector(usernameFieldLocator));
    }

    public static WebElement passwordField(WebDriver driver) {
        return driver.findElement(By.id(passwordFieldLocator));
    }

    public static WebElement logInButton(WebDriver driver) {
        return driver.findElement(By.cssSelector(logInButtonLocator));
    }

    public static WebElement logInAlertMessage(WebDriver driver) {
        return driver.findElement(By.xpath(logInAlertMessageLocator));
    }


}
