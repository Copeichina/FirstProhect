package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textMethodOfXpath {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");
        String expectedResult="Context Menu";
        WebElement actualElement=driver.findElement(By.xpath("//h3[text()='Context Menu']"));
        String actualResult=actualElement.getText();

        if(expectedResult.equals(actualResult)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected "+expectedResult);
            System.out.println("Actual "+actualResult);
        }

        driver.close();

    }
}
