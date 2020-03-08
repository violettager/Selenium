package com.cybertek.tests.day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkText {
    public static void main(String[] args) {
        //Locator --> LinkText
        //<a> a tag is link . in this situation we will use linkText locator
        //to locate the element
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();
        WebElement example3= driver.findElement(By.linkText("Example 3: Element on page that is hidden " +
                "and become visible after 5 seconds"));
        String textVersionOfExample3 =  example3.getText();
        System.out.println("textVersionOfExample3 = " + textVersionOfExample3);

        //linkText vs partialLinkText
        //i want to locate Example3 with only a part of it

        WebElement example_2 = driver.findElement(By.partialLinkText("Example 3:"));
        String text = example_2.getText();
        System.out.println("text = " + text);

        WebElement cybertekSchool= driver.findElement(By.linkText("Cybertek School"));
        String cybertek= cybertekSchool.getText();
        System.out.println("cybertek = " + cybertek);

        String examplePart= driver.findElement(By.partialLinkText("School")).getText();
        System.out.println("examplePart = " + examplePart);
        driver.quit();

        //locate the element : home


    }
}

