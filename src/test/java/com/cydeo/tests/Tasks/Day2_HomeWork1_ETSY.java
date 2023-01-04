package com.cydeo.tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_HomeWork1_ETSY {
    public static void main(String[] args) {

        //    TC #1: Etsy Title Verification

        //        1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //        2. Go to https://www.etsy.com

        driver.get("https://www.etsy.com");
        WebElement agreeButton=driver.findElement(By.xpath("//*[@id=\"gdpr-single-choice-overlay\"]/div/div[2]/div[2]/button"));
      agreeButton.click();


        //        3. Search for “wooden spoon”

        WebElement etsySearchBox= driver.findElement(By.name("search_query"));
        etsySearchBox.sendKeys("wooden spoon"+ Keys.ENTER);


        //        4. Verify title:
        //        Expected: “Wooden spoon | Etsy”

        String expectedTitle ="Wooden spoon | Etsy UK";

        String actualTitle= driver.getTitle();

        if (actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title verification PASS");

        }else {

            System.out.println("Title verification Failed");
        }






    }
}
