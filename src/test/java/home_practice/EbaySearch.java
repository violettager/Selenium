package home_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbaySearch {
    public static void main(String[] args) throws Exception{
        /*
        Task:
 1.Go to amazon  https://www.amazon.com/
 2.Go to Ebay   https://www.ebay.com/
 3.Enter a search term
 4.Click on search button
 5.Verify title contains search term
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.navigate().to("https://www.ebay.com/");
        WebElement searchBox = driver.findElement(By.name("_nkw"));
        searchBox.sendKeys("shoes"+ Keys.ENTER);
        Thread.sleep(3000);
String expectedTitle = "shoes";
String actualTitle    = driver.getTitle();
        if(actualTitle.contains(expectedTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        driver.quit();




    }
}
