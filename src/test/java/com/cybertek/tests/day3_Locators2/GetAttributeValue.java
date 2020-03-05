package com.cybertek.tests.day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        // i want to get the value of type attribute
        //type = "text" ->getAttribute("attribute name")

        WebElement username = driver.findElement(By.name("username"));

        //<input type = "text" name = "username">
        String valueOfType = username.getAttribute("type");
        System.out.println(valueOfType);


        String  valueOfClass = driver.findElement(By.id("wooden_spoon")).getAttribute("class");
        System.out.println("valueOfClass = " + valueOfClass);
       //driver.quit();
        //getText vs getAttribute








    }
}
