package com.thetestingpractise.ex_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class Selenium04 {

       @Test
        public void testMethod()  {

            // Import Concept of OOPs ->
            // Upcasting -> Dynamic Dispatch - Polymorphism

           // In Selenium 3 -
           // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

           // In Selenium 4
           // Opera Remove - No Usage of the setProperty


           WebDriver driver = new EdgeDriver();
           WebDriver driver2 = new ChromeDriver();
           WebDriver driver3 = new FirefoxDriver();
           WebDriver driver4 = new InternetExplorerDriver();
           WebDriver driver5 = new SafariDriver();

           // SearchContext (I) (2) -> WebDriver(I) (10) -> RemoteWebDriver(C) (15) -> ChromiumDriver (c) 25 -> EdgeDriver(C) (45)

           // SearchContext - Interface - findElement, and findElements - GGF
           // WebDriver - Interface - Some Incomplete functions - GF
           // RemoteWebDriver - Class - It has some functions - F
           // ChromeDriver, FirefoxDriver, EdgeDriver, SafariDriver, InternetExplorerDriver

           // Selenium - Arch - API
           // Create Session , Commands or Functions -> API Request to Browser Driver (
           // Pass the commands as API

           // SearchContext driver = new ChromeDriver(); ( son , GGF ,available)
           // WebDriver driver = new ChromeDriver();     ( son , GGF ,available)
           // RemoteWebDriver driver1 = new ChromeDriver();
           // driver1 = new EdgeDriver() // in future with help of remote we can change driver via Remote or WebDriver

           // ChromeDriver driver = new ChromeDriver();
           // driver = EdgeDriver(); // Not Possible we will be limited to only Chrome driver and not other Browsers


           // WebDriver driver = new ChromeDriver();

           //do you want to run on chrome or Edge ?
          // ChromeDriver driver = new ChromeDriver(); -1%


           //Do you want to run on Chrome then change to Edge ?
           // WebDriver driver = new ChromeDriver();
           //driver = new EdgeDriver(); 97%

           //do you want to run on multiple browsers , aws machine ?
           // RemoteWebDriver driver ( with GRID) - Advance ( Last 2 Sessions )







       }

}
