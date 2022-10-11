package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Without_POM {

    public static void main(String[] args) throws InterruptedException {

        //Instantiating chrome driver
        System.setProperty("webdriver.chrome.driver", "C:/Users/Samuil/JQAChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();

        //Opening web application
        driver.get("https://demoqa.com/text-box");
        // Wait for the page to be loaded
        Thread.sleep(2000);

        //Locating the Login button and clicking on it
        //driver.findElement(By.id("login")).click();

        //Locating the username & password and passing the credentials
        //driver.findElement(By.id("userName")).sendKeys("gunjankaushik");
        //driver.findElement(By.id("password")).sendKeys("Password@123");

        //Click on the login button
        //driver.findElement(By.id("login")).click();



        //driver.findElement(By.xpath("//div[@class='element-group'][4]")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//div[@class='element-group'][4]//*[contains(text(),'Menu')]")).click();



        // Wait for login to be completed
        //Thread.sleep(2000);

        //Print the web page heading
        //System.out.println("The page title is : " +driver.findElement(By.xpath("//span[@id='see-book-Learning JavaScript Design Patterns']//a")).getText());

        //Click on Logout button
        //driver.findElement(By.id("submit")).click();

        // Wait for logout to be completed
        //Thread.sleep(2000);


        //The text form test
        driver.findElement(By.id("userName")).click();
        driver.findElement(By.id("userName")).sendKeys("Zdravko");
        driver.findElement(By.id("userEmail")).click();
        driver.findElement(By.id("userEmail")).sendKeys("zdravko@test.com");
        driver.findElement(By.id("currentAddress")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("currentAddress");
        driver.findElement(By.id("permanentAddress")).click();
        driver.findElement(By.id("permanentAddress")).sendKeys("permanentAddress");
        driver.findElement(By.id("submit")).click();

        Thread.sleep(4000);

        //Close driver instance
        driver.quit();
    }

}