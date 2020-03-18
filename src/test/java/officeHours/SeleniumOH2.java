package officeHours;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {
    /*
    1.Go to http://automationpractice.com
    2.Search for "tshirt" in a searchbox+cklik enter or click search button
    3.validate you got "no results " message on UI
    4.Search for "t-shirts"
    5.Validate there was 1 result found
     */
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
        WebElement search_box=driver.findElement(By.id("search_query_top"));
        //how to press enter
        search_box.sendKeys("tshirt"+ Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement error=driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
        String errorText=error.getText();//getText()->returns String (text) from the element
        System.out.println("Error message "+errorText);
       // search_box.clear();
        search_box.sendKeys("t-shirt"+Keys.ENTER);

        driver.quit();

    }
}
