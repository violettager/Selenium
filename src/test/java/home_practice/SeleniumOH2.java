package home_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumOH2 {
    public static void main(String[] args) throws Exception{
        //go to http://automationpractice.com
        //search for tshirt in a searchbox+click enter or click search button
        //validate you got 'no results' message on UI
        //search for 'tshirt'
        //validate there was 1 result found
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationpractice.com");
        driver.manage().window().maximize();
Thread.sleep(3000);
        WebElement searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.sendKeys("tshirt"+ Keys.ENTER);
        /*
        <p class="alert alert-warning">
					No results were found for your search&nbsp;"tshirt"
			</p>
         */

Thread.sleep(5000);
        WebElement error = driver.findElement(By.xpath("//p[@class='alert alert-warning']"));
        String errorText = error.getText();

        //.getText()--> returns String (text) from element
        System.out.println("error message - "+ errorText);

        //NoSuchElementException - it means we could not locate the element
        searchBox = driver.findElement(By.id("search_query_top"));
        searchBox.clear();
        searchBox.sendKeys("t-shirt"+Keys.ENTER);
        //StaleElementReferenceException - element is old/stalewe want to find
        //this element again Or refresh page
        Thread.sleep(3000);
        driver.quit();
        try{
            Thread.sleep(3000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        WebElement count = driver.findElement(By.id("product-count"));

        driver.quit();






    }
}
