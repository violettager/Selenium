package com.cybertek.tests.day4_xpath;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClickVsSubmit {
    public static void main(String[] args) throws InterruptedException {
        /*
        click()
        submit()
              task:
        1. go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
       2.  enter any email
       3. click "retrieve password" bttb
        4. verify the URL is:
        http://practice.cybertekschool.com/email_sent
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        //enter any email
        WebElement emailBox= driver.findElement(By.name("email"));
        Thread.sleep(3000);
        emailBox.sendKeys("aripova.tahmina@mail.ru");
        driver.findElement(By.id("form_submit")).submit();
        String expectedLink ="http://practice.cybertekschool.com/email_sent";
        if(expectedLink.equalsIgnoreCase(driver.getCurrentUrl())){
            System.out.println("Pass");
        } else{
            System.out.println("Fail, not same link");
        }
        driver.quit();
    }
}