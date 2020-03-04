package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    public static void main(String[] args) {
        /*
        1. go to Etsy -  https.www.etsy.com/
        2. Verify URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().maximize();

        //for verify title we used  ----> getTitle();  method
        //for verify URL we use -----> method

        String expectedURL = "https://www.etsy.com/";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected - " + expectedURL);
            System.out.println("The actual URL is -  " + actualURL);


        }
        driver.quit();




    }
}
