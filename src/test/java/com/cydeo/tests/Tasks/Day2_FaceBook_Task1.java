package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_FaceBook_Task1 {

    public static void main(String[] args) {

     //TC #1: Facebook title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com

        driver.get("https://www.facebook.com");
        WebElement agreeButton = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[1]"));
        agreeButton.click();

        //3. Verify title:
        //Expected: “Facebook - Log In or Sign Up”

        String expectedTitle="Facebook - Log In or Sign Up";
        String actualTitle= driver.getTitle();

        System.out.println(actualTitle);

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }







    }

}
