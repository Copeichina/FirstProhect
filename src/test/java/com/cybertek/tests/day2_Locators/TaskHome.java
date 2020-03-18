package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskHome {
    /*
    Task:
Go to amazon  https://www.amazon.com/
 Go to Ebay   https://www.ebay.com/
Enter a search term
Click on search button
Verify title contains search term

     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");
        driver.findElement(By.id("gh-ac")).sendKeys("shoes");
        driver.findElement(By.id("gh-btn")).click();

        String expectedTitle="shoes | eBay";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedTitle);
            System.out.println("Actual "+actualTitle);
        }
        driver.quit();
    }
}
