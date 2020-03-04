package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeURL {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com/");

        String googleTitle="Google";

         driver.get("https://www.etsy.com/");
        String etsyTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        driver.navigate().back();
        if(driver.getTitle().equals(googleTitle)){
            System.out.println("Pass Google title is the same as actual");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+googleTitle);
            System.out.println("Actual "+driver.getTitle());
        }
        driver.navigate().forward();
        if(etsyTitle.equals(driver.getTitle())){
            System.out.println("PASS");
            System.out.println("The titles are the same");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+etsyTitle);
            System.out.println("Actual "+driver.getTitle());
        }
        driver.quit();

    }
}
