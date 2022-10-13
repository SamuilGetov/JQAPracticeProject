package com.elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageElements {

    private String baseUrl = "https://robotsparebinindustries.com/";
    public static String username = "maria";
    public static String password = "thoushallnotpass";
    public static String invalidUsernamePasswordText = "Invalid username or password.";


    public String getUrl() {
        return baseUrl;
    }


    public static WebElement homeButton(WebDriver driver) {
        return driver.findElement(By.xpath("//a[.='Home']"));
    }

    public static WebElement usernameField(WebDriver driver) {
        return driver.findElement(By.cssSelector("#username"));
    }

    public static WebElement passwordField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public static WebElement logInButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    }
    public static WebElement logInAlertMessage(WebDriver driver) {
        return driver.findElement(By.xpath("//div[@class='alert alert-warning']"));
    }



}
