package com.cybertek.tests.day4_xpath;
import com.cybertek.utilities.WebDriveFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class TextMethodOfMethod {
    public static void main(String[] args) throws InterruptedException {
        /*
        go to http://practice.cybertekschool.com/context_menu
        verify context Menu is on the page
         */
        WebDriver driver= WebDriveFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/context_menu");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"content\"]/div/h3")).getText());
        WebElement text = driver.findElement(By.xpath("//h3[text()='Context Menu']"));
        System.out.println(text.getText());
        Thread.sleep(3000);
        driver.quit();
    }
}