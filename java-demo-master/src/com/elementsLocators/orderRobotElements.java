package com.elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class orderRobotElements {
    public  static String shippingAddress= "Bulgaria, Sofia, Ivan Vazov Str. 1";

    public static WebElement orderRobotButton(WebDriver driver) {
        return driver.findElement(By.xpath("//a[.='Order your robot!']"));
    }

    public static WebElement OKButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-dark']"));
    }

    public static WebElement yupButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
    }

    public static WebElement iGuessSoButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
    }

    public static WebElement noWayButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@class='btn btn-success']"));
    }

    public static WebElement robotHeadDropdown(WebDriver driver) {
        return driver.findElement(By.xpath("//select[@id='head']"));
    }

    public static WebElement legsNumberField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@placeholder='Enter the part number for the legs']"));
    }

    public static WebElement rollAThorHead(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"head\"]/option[2]"));
    }

    public static WebElement previewButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@id='preview']"));
    }

    public static WebElement orderButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@id='order']"));
    }

    public static WebElement showHideModelInfoButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[.='Show model info']"));
    }

    public static WebElement shippingAddressField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@id='address']"));
    }
    public static WebElement robotImage(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"robot-preview\"]"));
    }
    public static WebElement modelInfoTable(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"model-info\"]"));
    }
    public static WebElement receipt(WebDriver driver) {
        return driver.findElement(By.xpath("//*[@id=\"receipt\"]"));
    }
    public static WebElement orderAnotherRobotButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@id='order-another']"));
    }
}
