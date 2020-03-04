package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {
        /*
        1.Go to cybertek practice web site
        2. Verify Title ----> Title is "Practice"
        "http://practice.cybertekschool.com/"

         */
        //connect browser and driver
        //setup browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");
        String expectedTitle = "practice";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected - " + expectedTitle);
            System.out.println("The actuall title is -  " + actualTitle);


        }

        driver.quit();
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.etsy.com");
        String expectedTitle2 = "Etsy - Shop for handmade, vintag, custom, and unique gifts for everyone";
        String actualResult2 = driver2.getTitle();
        if (expectedTitle2.equals(actualResult2)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected - " + expectedTitle2);
            System.out.println("The actual title is -  " + actualResult2);

    }
        driver2.quit();
    }
}
