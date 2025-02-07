package com.thetestingpractise.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium12 {
    // Open the app.vwo.com
    // we want to verify the title by using the TestNG assertion

    @Test
    public void testVWOLoginPageTitle(){
      //  EdgeOptions edgeOptions = new EdgeOptions();
     // edgeOptions.addArguments("--start-maximized"); // 1st way to maximize browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");
        driver.manage().window().maximize();  // 2nd way to maximize browser
      // driver.manage().window().minimize();  // 2nd way to maximize browser


        Assert.assertEquals(driver.getTitle(),"Login - VWO");// It will give the title
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");// It will give the title
        driver.quit();




    }
}
