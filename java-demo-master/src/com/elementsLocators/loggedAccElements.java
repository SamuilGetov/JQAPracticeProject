package com.elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loggedAccElements {
    public static String firstName = "firstName";
    public static String lastName = "lastName";
    public static String salesResultNegative = "1";
    public static String salesResultPositive = "5001";
    public static String salesResultLow = "4999";
    public static String positivePerformanceFeedback = "A positive result. Well done!";
    public static String negativePerformanceFeedback = "The boss wants to see you...";
    public static String lowPerformanceFeedback = "Hmm. Did not quite make it.";


    public static WebElement firstNameField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='firstname']"));
    }


    public static WebElement lastNameField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='lastname']"));
    }

    public static WebElement salesTargetDropdown(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@id='salestarget']"));
    }

    public static WebElement salesResultField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='salesresult']"));
    }

    public static WebElement salesResultFieldArrowUp(WebDriver driver) {
        return driver.findElement(By.xpath(".............."));
    }

    public static WebElement salesResultFieldArrowDown(WebDriver driver) {
        return driver.findElement(By.xpath("........................"));
    }

    public static WebElement submitButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
    }

    public static WebElement performanceButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-info btn-secondary']"));
    }
    public static WebElement logOutButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@id='logout']"));
    }

    public static WebElement deleteAllSalesEntries(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-danger btn-secondary']"));
    }

    public static WebElement performanceInfo(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"sales-results\"]/table/tbody/tr[2]/td/span"));
    }
    public static WebElement accNameDisplayed(WebDriver driver) {
        return driver.findElement(By.cssSelector(".username"));
    }

}


