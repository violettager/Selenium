package com.cybertek.tests.day4_xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute2 {
    public static void main(String[] args) {
        /*
        http://practice.cybertekschool.com/dynamic_loading
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        WebElement ex1= driver.findElement(By.partialLinkText("Example 1"));
        System.out.println(ex1.getAttribute("href"));
        driver.close();
    }
}