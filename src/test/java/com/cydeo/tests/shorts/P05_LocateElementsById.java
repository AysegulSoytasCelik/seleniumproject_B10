package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P05_LocateElementsById {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();


        //navigate
        driver.get("https://google.com");
        WebElement agreeButton= driver.findElement(By.id("L2AGLb"));
        agreeButton.click();

       WebElement luckyButton= driver.findElement(By.id("gbqfbb"));
      //   luckyButton.click();

       String text= luckyButton.getAttribute("value");

       if (text.equals("I'm Feeling Lucky")){
           System.out.println("test passed");
       }else{
           System.out.println("test failed");
       }

driver.quit();





    }
}
