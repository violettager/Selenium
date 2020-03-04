package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
    public static void main(String[] args) throws Exception {
        /*
        driver.get()
        driver.navigate().to("URL")
        driver.navigate().back()
        driver.navigate().forward()
        driver.navigate().refresh()
        driver.close()

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //i want to see full window size
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        String practiceWebURL = "http://practice.cybertekschool.com/";
        driver.get(practiceWebURL);
        Thread.sleep(3000);
        String gglURL = "https://www.google.com";
        driver.navigate().to(gglURL);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        //close drive
        //close the web browser only
        driver.close();
        //close down all the windows in the browser
        driver.quit();

        }
    }

