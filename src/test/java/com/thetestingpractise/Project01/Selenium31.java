package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium31 {

    public void Omegaxl() throws InterruptedException {


        //  EdgeOptions edgeOptions = new EdgeOptions();
        //   edgeOptions.addArguments("--start_maximized
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://p29667083c1dev-store.occa.ocs.oraclecloud.com/");
        // driver.manage().window().maximize();

        Thread.sleep(3000);

        // WebElement username_input = driver.findElement(By.id("username"));
        //      WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id= 'username']"));
        //       WebElement username_input_css_1 = driver.findElement(By.cssSelector("input#username"));
        //      WebElement username_input_css_2= driver.findElement(By.cssSelector("#username"));

        // #gh-ac
        // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement Accountlogin = driver.findElement(By.xpath ()//span[@class='GHWUserProfile_UserIcon']));
                Accountlogin.Click();

        WebElement searchBoxButton = driver.findElement(By.xpath("//span[@class='gh-search-button__label']"));
        searchBoxButton.click();


        Thread.sleep(2000);
        driver.quit();

    }
