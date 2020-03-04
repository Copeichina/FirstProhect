package com.cybertek.tests.day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitle {
    public static void main(String[] args) {
        String etsyTile="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.etsy.com/");
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(etsyTile)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+etsyTile);
            System.out.println("Actual "+actualTitle);
        }
    }
}
