package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day2_HomeWork4_Cydeo {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://practice.cydeo.com/inputs

        driver.get("https://practice.cydeo.com/inputs");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //3- Click to “Home” link
        //PS: Locate “Home” link using “className” locator

        driver.findElement(By.className("nav-link")).click();

        //4- Verify title is as expected:
        //Expected: Practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }


driver.close();




    }
}
