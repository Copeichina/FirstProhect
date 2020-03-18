package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    //write a return method whitch returns WebDriver
    //name:getDriver
    //it takes a String as a parameter-->browser type
    //rerurns ChromDriver and FirefoxDriver

    public static WebDriver getDriver(String browserType){
        WebDriver driver=null;
        if(browserType.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browserType.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        return driver;
    }
}
