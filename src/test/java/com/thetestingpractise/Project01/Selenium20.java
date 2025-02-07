package com.thetestingpractise.Project01;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium20 {
    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://bing.com");
        // No back, forward allowed in case of get

        driver.navigate().to("https://app.vwo.com");
        // driver.navigate().to( new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        // using navigate().to we can go back , forward

    }
}
