package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_getText_getAttributes {
    public static void main(String[] args) {

        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.manage().window().maximize();


        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        //3- Enter incorrect username into login box:

        WebElement loginBox= driver.findElement(By.xpath("//*[@id=\"login-popup\"]/form/div[2]/div[1]/input"));

        loginBox.sendKeys("incorrect username");


        //4- Click to `Reset password` button

        WebElement resetPasswordButton= driver.findElement(By.className("login-btn"));
        resetPasswordButton.click();

        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

      //  String expectedErrorText= ""
        WebElement actualErrorText=driver.findElement(By.className("errortext"));
        String ErrorText = actualErrorText.getAttribute("errortext");

      //  System.out.println("error");


        //PS: Inspect and decide which locator you should be using to locate web
        //elements.
        //PS2: Pay attention to where to get the text of this button from









    }
}
