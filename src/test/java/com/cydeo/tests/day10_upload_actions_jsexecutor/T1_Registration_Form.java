package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class T1_Registration_Form {


    @Test
    public void registration_form_test(){

        //TC#1: Registration form confirmation
        //Note: Use JavaFaker OR read from configuration.properties file when possible.
        //1. Open browser
        //2. Go to website: https://practice.cydeo.com/registration_form

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));


        //3. Enter first name (create JavaFaker object)
        Faker faker =new Faker();

        WebElement inputFirstName= Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

        //4. Enter last name

        WebElement inputLastName =Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username

        WebElement inputUserName =Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
       // inputUserName.sendKeys(faker.name().username().replaceAll(".",""));

        String user= (faker.bothify("heppdesk####"));
        inputUserName.sendKeys(user);

        //6. Enter email address

        WebElement inputEmail= Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@email.com");

        //7. Enter password

        WebElement inputPassword =Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("###??##!#?##!"));
        //faker.internet().password()

        //8. Enter phone number

        WebElement inputPhoneNumber =Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));


        //9. Select a gender from radio buttons

        WebElement inputGender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();


        //10.Enter date of birth

        WebElement inputDateOfBirth = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
       // faker.number().numberBetween(1,12);
        inputDateOfBirth.sendKeys("01/22/2005");


        //11.Select Department/Office

        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));

        //if you don't want to be randomly selected you can write:
        //departmentDropdown.selectByIndex(7) -->it's index number of the titles which are in the department button

        //12.Select Job Title
        Select jobTitle= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(6);

        //13.Select programming language from checkboxes

        WebElement programmingLanguage1 = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox1']"));
        WebElement programmingLanguage2 = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox2']"));
        WebElement programmingLanguage3 = Driver.getDriver().findElement(By.xpath("//input[@id='inlineCheckbox3']"));

        programmingLanguage1.click();
        programmingLanguage2.click();
        programmingLanguage3.click();


        //14.Click to sign up button
        WebElement clickButton = Driver.getDriver().findElement(By.xpath("//button[@id='wooden_spoon']"));
        clickButton.click();

        //15.Verify success message “You’ve successfully completed registration.” is displayed.



        //Note:
        //1. Use new Driver utility class and method
        //2. User JavaFaker when possible
        //3. User ConfigurationReader when it makes sense






    }








}
