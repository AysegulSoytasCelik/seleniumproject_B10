package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) {
        //TC #1: Yahoo Title Verification
        //  --> do setup for browser driver

        WebDriverManager.chromedriver().setup();


        //        1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //


        //2. Go to https://www.yahoo.com

        driver.get("https://www.yahoo.com");
      //  WebElement agreeButton= driver.findElement(By.xpath("//*[@id=\"consent-page\"]/div/div/div/form/div[2]/div[2]/button"));






    }
}