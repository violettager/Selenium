package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*
        1. go to "http://practice.cybertekschool.com/"
        2. Verify the URL
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedURL = "http://practice.cybertekschoo.com/";
        String actualURL = driver.getCurrentUrl();
        if(expectedURL.equals(actualURL)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
            System.out.println("expected - "+expectedURL);
            System.out.println("actual - "+actualURL);
        }
        driver.quit();
    }
}
