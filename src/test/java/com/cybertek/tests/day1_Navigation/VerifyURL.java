package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    /*
    1.go to etsy
    2.verify URL
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        //for verifying title we used getTitle()
        //for verifying URL -->getCurrentUrl()

        String expectedURL="https://www.etsy.com/";
        String actualURL=driver.getCurrentUrl();

        if(expectedURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAILS");
            System.out.println("Expected "+expectedURL);
            System.out.println("Actual "+actualURL);
        }
        driver.close();
    }
}
