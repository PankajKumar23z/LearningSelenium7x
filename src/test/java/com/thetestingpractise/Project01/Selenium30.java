package com.thetestingpractise.Project01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Selenium30 {


    @Test
    public void test_verify_print_imac_price() throws InterruptedException {


        //  EdgeOptions edgeOptions = new EdgeOptions();
        //   edgeOptions.addArguments("--start_maximized
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");


         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Thread.sleep(3000);

        // WebElement username_input = driver.findElement(By.id("username"));
        //      WebElement username_input_xpath = driver.findElement(By.xpath("//input[@id= 'username']"));
        //       WebElement username_input_css_1 = driver.findElement(By.cssSelector("input#username"));
        //      WebElement username_input_css_2= driver.findElement(By.cssSelector("#username"));

        // #gh-ac
        // input[id="gh-ac"] -> xpath -> //input[@id="gh-ac"]
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("macmini");

        WebElement searchBoxButton = driver.findElement(By.xpath("//span[@class='gh-search-button__label']"));
        searchBoxButton.click();


        Thread.sleep(3000);

        // Print all the titles

        List<WebElement> searchTitles = driver.findElements(By.cssSelector(".s-item__title"));

        // Xpath - //div[@class="s-item__title"]/span  -- 62

        List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));

        // Xpath - //span[@class="s-item__price"]  -  61

        // .s_item__title > 63 , .s-item__price ->
        // max -> loop where
        int size = Math.min(searchTitles.size(), searchTitlesPrices.size());  // 61
        for (int i = 0; i < size; i++) {

            System.out.println("Title: " + searchTitles.get(i).getText() + " || " + "Price: " + searchTitlesPrices.get(i).getText());
            System.out.println();

        }


    }
}

