package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws Exception {
        /*
        driver.get()
        driver.navigate().to("URL")
        driver.navigate().back()
        driver.navigate().forward()
        driver.navigate().refresh()

         */
        WebDriverManager.chromedriver().setup();
        //System.out.println("hello Selenium!");
        //WebDriver object - Interface

        WebDriver driver = new ChromeDriver();

        // i want to open Google home page

        //i launch/ open a webPage by using get()-->url as a string
        driver.get("https://www.google.com");
        //navigate().to()--> open web page
        driver.navigate().to("https://www.google.com");
        //get() vs navigate().to()
        //get()--> wait to load the page
        //to()-->does not wait
        //navigate().back()-->
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        //navigate().forward()
        //go to practice-->go to google-->back to practice
        //-->forward to google


    }
}
