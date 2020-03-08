package com.cybertek.tests.day4_xpath;
import com.cybertek.utilities.WebDriveFactory;
import org.openqa.selenium.WebDriver;
public class PracticeFactory {
    public static void main(String[] args) {
        WebDriver driver= WebDriveFactory.getDriver("Chrome");
        driver.get("https://google.com");
    }
}