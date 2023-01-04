package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P12_LocateElementByClassName {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        driver.get("https://google.com");
        WebElement agreeButton= driver.findElement(By.id("L2AGLb"));
        agreeButton.click();


        WebElement countryButton= driver.findElement(By.className("uU7dJb"));
        String countryText = countryButton.getAttribute("class");

        if (countryText.equals("United Kingdom")){
            System.out.println("test PASSED");
        }else{
            System.out.println("test FAILED");
        }















    }
}
