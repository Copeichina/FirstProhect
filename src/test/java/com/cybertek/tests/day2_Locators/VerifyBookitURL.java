package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyBookitURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String url=driver.getCurrentUrl();
        String containPart="cybertek-reservation";
        if(url.contains(containPart)){
            System.out.println("PASS");
            System.out.println("URL contains "+containPart);
        }else{
            System.out.println("FAIL");
            System.out.println("URL does not contain "+containPart);
        }
        driver.close();
    }
}
