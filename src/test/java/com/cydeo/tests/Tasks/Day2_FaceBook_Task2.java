package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day2_FaceBook_Task2 {
    public static void main(String[] args) {


      // //TC #2: Facebook incorrect login title verification
        //        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        //        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");
        WebElement agreeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]"));
        agreeButton.click();


        //        //3. Enter incorrect username
        WebElement facebookUsername = driver.findElement(By.id("email"));
        facebookUsername.sendKeys("wooden spoon");

        //        //4. Enter incorrect password

        WebElement facebookPassword = driver.findElement(By.id("pass"));
        facebookPassword.sendKeys("1.2.3.4.5"+Keys.ENTER);


        //        //5. Verify title changed to:
        //        //Expected: “Log into Facebook”
        String expectedTitle="Log into Facebook";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        String actualTitle = driver.getTitle();

        System.out.println(actualTitle);


        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }





    }
}
