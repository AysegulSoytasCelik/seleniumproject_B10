package com.cydeo.tests.shorts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_GettingPageTitle {
    public static void main(String[] args) {

        //set up chrome and create webdriver instance

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();


        //navigate to google and print out the title

        driver.get("https://cydeo.com");

        String title = driver.getTitle();
        System.out.println("title= "+title);


        if (title.equals("Cydeo")){
            System.out.println("test passed");
        }else {
            System.out.println("test failed");
        }

        driver.quit();








    }
}
