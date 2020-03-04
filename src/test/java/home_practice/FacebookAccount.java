package home_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookAccount {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.facebook.com/");
        String expectedTitle ="Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Passed");
        }else{
            System.out.println("failed");
            System.out.println("expected title: "+expectedTitle);
            System.out.println("actual title: "+actualTitle);
        }
        driver.close();
    }
}
