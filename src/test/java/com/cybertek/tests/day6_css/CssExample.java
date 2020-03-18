package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button = driver.findElement(By.cssSelector("h4"));
        System.out.println(button.getText());
        driver.quit();


    }
}
