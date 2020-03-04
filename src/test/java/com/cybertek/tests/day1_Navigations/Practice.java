package com.cybertek.tests.day1_Navigations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
    public static void main(String[] args) throws Exception{
        /*
        Task:
1. Go to google website
2. save the title in a string variable
3. go to Etsy
4. save the Etsy Title in a String
5. Navigate back to previouse page
6. Verify the title is same as step 2
7. Navigate forward to previous page
8.Verify the title is same as step 4
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        String expectedGlTitle = "Google";

        driver.navigate().to("https://www.etsy.com/");
        Thread.sleep(3000);
        String expectedEtsyTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        driver.navigate().back(); //google
        Thread.sleep(3000);
        String actualGlTitle = driver.getTitle();
        Thread.sleep(3000);
        if (expectedGlTitle.equals(actualGlTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected etsy title- " + expectedGlTitle);
            System.out.println("The actuall etsy title is -  " + actualGlTitle);


        }
        driver.navigate().forward();
        Thread.sleep(3000);
        String actualEtsyTitle = driver.getTitle();
        if (expectedEtsyTitle.equals(actualEtsyTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("i expected etsy title- " + expectedEtsyTitle);
            System.out.println("The actuall etsy title is -  " + actualEtsyTitle);


        }
        driver.quit();
    }
}
