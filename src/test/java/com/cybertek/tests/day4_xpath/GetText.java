package com.cybertek.tests.day4_xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetText {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        //enter any email
        WebElement emailBox= driver.findElement(By.name("email"));
        Thread.sleep(3000);
        emailBox.sendKeys("aripova.tahmina@mail.ru");
        driver.findElement(By.id("form_submit")).submit();
        String expectedText= "Your e-mail's been sent!";
        WebElement message= driver.findElement(By.name("confirmation_message"));
        String actualText= message.getText();
        if(expectedText.equalsIgnoreCase(actualText)){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }
        driver.quit();
    }
}