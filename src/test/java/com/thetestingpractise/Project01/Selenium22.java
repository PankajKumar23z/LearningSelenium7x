package com.thetestingpractise.Project01;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.edge.EdgeOptions;

public class Selenium22 {
    public static void main(String[] args) {

        EdgeOptions options  = new EdgeOptions();
     //   options.addArguments("--start-maximized");
    //    options.addArguments("--window-size=800,600");
     //   options.addArguments("--guest");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("123.129.35.173:57114");
        options.setCapability("proxy", proxy);
        // We can create P and connect to P and P will connect to internet
        // If we want to use USA proxy then we will US Proxy it will open browser and will act as US proxy
        // We will use either Proxy or VPN either one of it





    }
}
