package com.thetestingpractise.Project01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSOutput;

public class Selenium52_Actions_P7 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }


    @Description("Verify File Uploaded")
    @Test
    public void test_file_upload() {

        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement uploadFilInput = driver.findElement(By.id("fileToUpload"));

        String dir = System.getProperty("user.dir");
        System.out.println(dir);
        // C:\Users\OrCon\Projects/src/test/java/com/thetestingpractise/Project01/Hello.txt
        uploadFilInput.sendKeys("C:\\Users\\OrCon\\Projects/src/test/java/com/thetestingpractise/Project01/Hello.txt");
        driver.findElement(By.name("submit")).click();

        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);
        // driver.manage().window().maximize();

        Actions actions = new Actions(driver);

        WebElement from = driver.findElement(By.id("column-a"));
        WebElement to = driver.findElement(By.id("column-b"));

        actions.dragAndDrop(from, to).perform();

        // actions.clickAndHold(from).moveToElement(to).release(to).build().perform();


    }


    @AfterTest
    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}





























