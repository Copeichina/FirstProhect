package com.cybertek.tests.day11_select_actions;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectClassTest {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void getSelectedOption(){
        // FIND THE ELEMENT THAT HAS SELECT TAG
        WebElement dropdown = driver.findElement(By.id("dropdown"));

        // create a select class using the web element
        Select dropdownList = new Select(dropdown);

        // get the selected option
        WebElement selectedOption = dropdownList.getFirstSelectedOption();
        System.out.println(selectedOption.getText());
        //verify selected option
        Assert.assertEquals(selectedOption.getText(),"Please select an option");
    }
    @Test
    public void selectFromList() throws InterruptedException {
        //get the element with select tag
        WebElement dropdown=driver.findElement(By.id("state"));
        Select states=new Select(dropdown);
        //selectByVisibleText()--> by the text of the option
        states.selectByVisibleText("Iowa");
        Thread.sleep(1000);
        states.selectByVisibleText("California");
        Thread.sleep(1000);
        states.selectByVisibleText("Kentucky");
        Thread.sleep(1000);

        //TODO selectByIndex--> select based on the index of the option
        states.selectByIndex(0);
        Thread.sleep(1000);
        states.selectByIndex(10);
        Thread.sleep(1000);
        states.selectByIndex(20);
        Thread.sleep(1000);

        //TODO selectByValue--> selects by the value of the attribute of the option
        //TODO it is not select by
        states.selectByValue("VA");
        Thread.sleep(1000);
        states.selectByValue("SC");
        Thread.sleep(1000);
        states.selectByValue("CO");
        Thread.sleep(1000);
    }
    @Test
    public void getAllAvalableOptions(){
        Select monthList=new Select(driver.findElement(By.id("month")));

        //print the current option
        System.out.println( monthList.getFirstSelectedOption().getText());

        //TODO getOptions()-->returns all of the available options from dropdown
       List<WebElement> allOptions= monthList.getOptions();
        System.out.println("Number of manths: "+allOptions.size());
       for(WebElement month:allOptions){
           System.out.println(month.getText());
       }



    }
    @Test
    public void getMonth(){
        Select monthList=new Select(driver.findElement(By.id("month")));
        List<WebElement> allOptions= monthList.getOptions();
        // verify that months list shows the current month as selected
        //get the current month by using Java
        String expected=  LocalDate.now().getMonth().name();
        String actual=monthList.getFirstSelectedOption().getText();
        Assert.assertEquals(actual.toLowerCase(),expected.toLowerCase());

        //verify that months list has following values: January...December
        List<String>expectedMonths= Arrays.asList("January","February","March","April","May","June","July","August","September",
                "October","November","December");

        //WebElement vs String
        //need to get list of String from list of WebElements

        List<String>actualMonths=new ArrayList<>();
        for(WebElement allOption:allOptions){
            actualMonths.add(allOption.getText());
        }
        Assert.assertEquals(actualMonths,expectedMonths);
    }

    @Test
    public void verifyOptions(){
        Select list=new Select(driver.findElement(By.id("dropdown")));
        //verify that list has 3 options
        int expectedSize=3;
        int actualSize=list.getOptions().size();
        List<String>expectedValues=Arrays.asList("Please select an option","Option 1","Option 2");

        List<String>actualValues=new ArrayList<>();

        for(WebElement option:list.getOptions()){
            actualValues.add(option.getText());
        }
        Assert.assertEquals(actualValues,expectedValues);
    }

}
