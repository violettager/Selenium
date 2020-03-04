package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://app.vytrack.com/user/login");
        WebElement emailBox = driver.findElement(By.id("prependedInput"));
        Thread.sleep(3000);
        emailBox.sendKeys("storemanager52");
        Thread.sleep(3000);
        WebElement passwordBox = driver.findElement(By.id("prependedInput2"));

        passwordBox.sendKeys("UserUser123");
        Thread.sleep(3000);

        WebElement loginBox = driver.findElement(By.id("_submit"));
        Thread.sleep(3000);
        loginBox.click();
        Thread.sleep(3000);
        driver.getTitle();
        if (driver.getTitle().equals("Dashboard")) {
            Thread.sleep(3000);
            System.out.println("passed");
        } else {
            System.out.println("fail!");
            System.out.println("title is different - " + driver.getTitle());
        }


        if (driver.getCurrentUrl().equals("https://app.vytrack.com/")) {

            System.out.println("passed URL test");
        } else {
            System.out.println("fail!");
            System.out.println("URL is different - " + driver.getCurrentUrl());
        }
        driver.quit();
    }
}
