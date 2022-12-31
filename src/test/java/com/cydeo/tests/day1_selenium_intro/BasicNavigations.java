package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        // 2- Create instance of the Selenium WebDriver
        //only this line without 3rd part, shows only empty page

        WebDriver driver = new ChromeDriver();


        //This line will maximize the browser size
        driver.manage().window().maximize();

        // 3- test if driver is working as expected

        driver.get("https://www.tesla.com");

        //get the title of the page
        String currentTitle= driver.getTitle();
        String currentURL = driver.getCurrentUrl();


        //stop code execution for 3 seconds
       Thread.sleep(3000);

        //use selenium to navigate back
        driver.navigate().back();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium navigate to refresh
        driver.navigate().refresh();

        //use navigate().to()
        driver.navigate().to("https://www.apple.com");


        //get the title of the page
        System.out.println("driver.getTitle() = " + driver.getTitle());


        System.out.println(currentTitle);  //will read line 23.  line 49 too


        //get the current url using selenium
         currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);



        //this will close the currently opened window
       // driver.close();

       //this will close all the opened window
        driver.quit();


    }

}
