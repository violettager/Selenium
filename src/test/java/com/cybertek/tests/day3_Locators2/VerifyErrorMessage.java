package com.cybertek.tests.day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class VerifyErrorMessage {
    public static void main(String[] args) throws Exception{
        /*
        1.go to login page
        2.enter invalid username
        3.enter invalid password
        4.verify the error message
         */
        //testers will gather test data in excel sheet
        //generate data from dummy data website
        //java faker
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        Faker fakeData = new Faker();
        String username = fakeData.name().username();
        String password = fakeData.name().name();
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("wooden_spoon")).click();






    }
}
