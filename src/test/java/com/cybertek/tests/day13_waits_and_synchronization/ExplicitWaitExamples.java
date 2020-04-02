package com.cybertek.tests.day13_waits_and_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWaitExamples {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        wait=new WebDriverWait(driver,10);

    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }

    @Test
    public void test(){
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.get("https://steam.com");

        //wait for title of second page
        //Explicit wait
        //create web object
        //WebDriverWait wait=new WebDriverWait(driver,10);
        //start waiting for title contain text
        wait.until(ExpectedConditions.titleContains("Steam"));
        System.out.println(driver.getTitle());
    }
    @Test
    public void test2WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement button=driver.findElement(By.tagName("button"));
        button.click();

        WebElement username=driver.findElement(By.id("username"));
        WebElement password=driver.findElement(By.id("pwd"));

        //waits for given element to be visible on page
        wait.until(ExpectedConditions.visibilityOf(username));
        //make sure the username is visible on page
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");


    }
    @Test
    public void test3WaitForVisibleFail(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));

        // give no,t enough time. change the wait time
        wait.withTimeout(Duration.ofSeconds(2));

        // waits for given element to be visible on page
        wait.until(ExpectedConditions.visibilityOf(username));
        // make sure that username is visible on page
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");
    }
    @Test
    public void test4WaitForClickable(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/6");

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));
        WebElement submit = driver.findElement(By.tagName("button"));

        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword");

        // wait for element to disappear


        // waits for given element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(submit));
        submit.click();
    }

    @Test
    public void test4WaitForInvisible(){
        driver.manage().window().maximize();
        driver.get("http://qa3.vytrack.com");
        WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        WebElement myCalendar = driver.findElement(By.linkText("My Calendar"));

        // wait until the element with class loader-mask is not visible
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-mask")));

        myCalendar.click();
    }
}
