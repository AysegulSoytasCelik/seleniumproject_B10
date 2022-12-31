package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day1_HomeWork3_BackAndForthNavigation {

    public static void main(String[] args) {

        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com
        driver.get("https://google.com");

        //WebElement agreeButton= driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
        //agreeButton.click();

        WebElement agreeButton = driver.findElement(By.id("L2AGLb"));
        agreeButton.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        //3- Click to Gmail from top right.
        driver.findElement(By.className("gb_j")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase (expectedTitle)) {

            System.out.println("Title verification Passed");
        } else {
            System.out.println("Title verification Failed");
        }
        System.out.println(actualTitle);


        //5- Go back to Google by using the .back();

        driver.navigate().back();

        //6- Verify title equals:
        //Expected: Google

        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.equalsIgnoreCase(expectedTitle2)){
            System.out.println(" Title 2 verification is PASSED");
        }else{
            System.out.println("Title 2 verification is FAILED");
        }

        
    }

}
