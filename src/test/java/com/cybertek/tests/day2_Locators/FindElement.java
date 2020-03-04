package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.select.Evaluator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {
      //locator id
        //go to cybertek okta login page
        //write email to the next box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com");
        //write email to the next box
        /*
        1.find the next box first-->findElement()  from WebDriver

         */
        String word = "java";
        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("violetta6991@gmail.com");

        WebElement passwordBox = driver.findElement(By.id("okta-signin-password"));

        passwordBox.sendKeys("69912142viola");
        WebElement rememberBox = driver.findElement(By.id("okta-signin-submit"));
        rememberBox.submit();


    }
}
