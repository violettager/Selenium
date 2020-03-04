package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.WatchEvent;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://cybertek-reservation-qa.herokuapp.com/sign-in");
        driver.manage().window().maximize();

        String expectedTitle = "bookit";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected - " + expectedTitle);
            System.out.println("The actuall title is -  " + actualTitle);
        }
        driver.close();

        WebDriver driver1 = new ChromeDriver();
        driver1.navigate().to("http://cybertek-reservation-qa.herokuapp.com/sign-in");
        String URL = driver1.getCurrentUrl();
        if(URL.contains("cybertek-reservation")){
            System.out.println("passed");

        }else {
            System.out.println("failed");
            System.out.println("Actuall URL is - " + URL);


        }
        driver1.close();


    }
}
