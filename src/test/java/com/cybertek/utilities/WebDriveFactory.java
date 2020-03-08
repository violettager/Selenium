package com.cybertek.utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class WebDriveFactory {
    public static void main(String[] args) {
        //write a static return method which return WebDriver
        //name: getDriver
        //it takes a String as a parameter --> browse type
        //returns ChromeDriver and FireFoxDriver
    }
    public static WebDriver getDriver(String browseType) {
        if (browseType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            return driver;
        } else if (browseType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            return driver;
        } else {
            return null;
        }
    }}