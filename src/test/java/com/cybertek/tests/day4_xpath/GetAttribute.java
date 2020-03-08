package com.cybertek.tests.day4_xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetAttribute {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement retreivePassword = driver.findElement(By.id("form_submit"));
        System.out.println(retreivePassword.getAttribute("type"));
        System.out.println(retreivePassword.getAttribute("class"));
        System.out.println(retreivePassword.getAttribute("id"));
        driver.quit();
    }
}
