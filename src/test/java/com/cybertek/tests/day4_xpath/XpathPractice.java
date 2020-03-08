package com.cybertek.tests.day4_xpath;
import com.cybertek.utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class XpathPractice {
    public static void main(String[] args) throws InterruptedException {
        //go to practice login page
        WebDriver driver = WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div/form/div[1]/div/input")).sendKeys("aripova.tahmina@mail.ru");
        driver.findElement(By.xpath("//*[@id=\"login\"]/div[2]/div/input")).sendKeys("Galaxys3"+Keys.ENTER);
        Thread.sleep(5000);
        //*[@id="login"]/div[1]/div/input
    }
}