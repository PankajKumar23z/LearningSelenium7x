package com.thetestingpractise.Project01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.sql.SQLOutput;

public class Selenium18 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
       // driver.get("https://katalon-demo-cura.herokupp.com/");
        driver.get("https://p29667083c1dev-store.occa.ocs.oraclecloud.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        if (driver.getPageSource().contains("GET OUT THERE")) {
            System.out.println("Verified");
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);

        }
        driver.quit();

    }
}
