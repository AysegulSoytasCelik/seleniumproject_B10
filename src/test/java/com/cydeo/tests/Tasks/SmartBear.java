package com.cydeo.tests.Tasks;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SmartBear {
    WebDriver driver;

    @BeforeMethod
    public void setupTest() {


        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");


    }


    // @Test
    //public void test1(){

    ///TC#2: Smartbear software order placing
    //    //1. Open browser
    //    //2. Go to website:
    //    //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    //    //3. Enter username: “Tester”
    //    //4. Enter password: “test”
    //    //5. Click on Login button

    //    smartBearUtils(driver);

    //    //6. Click on Order

    @Test
    public void loginTester() {
        //3. Enter username: “Tester”
        WebElement userInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userInputBox.sendKeys("Tester");

        //4. Enter password: “test”
        WebElement passInputBox = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passInputBox.sendKeys("test");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();


        WebElement orderButton = driver.findElement(By.xpath("//*[@href='Process.aspx']"));
        orderButton.click();


        //    //7. Select familyAlbum from product, set quantity to 2

        WebElement familyAlbum = driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']"));
        Select select = new Select(familyAlbum);
        select.selectByVisibleText("FamilyAlbum");

        WebElement quantityInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
        quantityInput.sendKeys("2");

//8. Click to “Calculate” button
        WebElement calculateButton =driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculateButton.click();

//9. Fill address Info with JavaFaker



//• Generate: name, street, city, state, zip code
//10. Click on “visa” radio button
//11. Generate card number using JavaFaker
//12. Click on “Process”
//13. Verify success message “New order has been successfully added.”

    }


}


//    //8. Click to “Calculate” button
//    //9. Fill address Info with JavaFaker
//    //• Generate: name, street, city, state, zip code
//    //10. Click on “visa” radio button
//    //11. Generate card number using JavaFaker
//    //12. Click on “Process”
//    //13. Verify success message “New order has been successfully added.”


//Mini-Task: CREATE A CLASS à SmartBearUtils
//• Create a method called loginToSmartBear
//• This method simply logs in to SmartBear when you call it.
//• Accepts WebDriver type as parameter
//
//TC#2: Smartbear software order placing
//1. Open browser
//2. Go to website:
//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
//3. Enter username: “Tester”
//4. Enter password: “test”
//5. Click on Login button
//6. Click on Order
//7. Select familyAlbum from product, set quantity to 2
//8. Click to “Calculate” button
//9. Fill address Info with JavaFaker
//• Generate: name, street, city, state, zip code
//10. Click on “visa” radio button
//11. Generate card number using JavaFaker
//12. Click on “Process”
//13. Verify success message “New order has been successfully added.”
//
//



