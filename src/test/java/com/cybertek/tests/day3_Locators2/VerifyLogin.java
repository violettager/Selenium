package com.cybertek.tests.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args)throws Exception {
        /*
        go to login page
        enter username
        enter password
        click login button
        Verify the welcome message "welcome to hte secure area. when you are done click
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        WebElement usernameBox = driver.findElement(By.name("username"));
        usernameBox.sendKeys("tomsmith");
        Thread.sleep(3000);
        WebElement passwordBox = driver.findElement(By.name("password"));
        passwordBox.sendKeys("SuperSecretPassword"+ Keys.ENTER);
        Thread.sleep(3000);
       // driver.quit();
        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));
        //verify the welcome message
        //expected vs Actual
        String expectedResult  = "Welcome to the Secure Area. When you are done click logout below.";
        //String vs WebElement
        String actualResult = welcomeMessage.getText();
        if(expectedResult.equals(actualResult)){
            System.out.println("congratulations you logged in!");
            System.out.println(" message - "+expectedResult);
        }else{
            System.out.println("failed");
            System.out.println("actual result - "+actualResult);
        }
        driver.quit();





    }
}
