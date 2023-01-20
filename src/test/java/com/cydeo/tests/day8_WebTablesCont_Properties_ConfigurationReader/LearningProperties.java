package com.cydeo.tests.day8_WebTablesCont_Properties_ConfigurationReader;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){

        //key=value
        //os.name= Windows 11 -gives this information about  my computer
        //user.name= pc
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));

    }



}
