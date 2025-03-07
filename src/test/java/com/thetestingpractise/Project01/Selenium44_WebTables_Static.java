package com.thetestingpractise.Project01;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium44_WebTables_Static {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Description("Verify Web Tables")
    @Test
    public void test_web_tables() {

        driver.manage().window().maximize();
        String URL ="https://awesomeqa.com/webtable.html";
        driver.get(URL);
        driver.manage().window().maximize();

        // Row  - //table[@id="customers"]/tbody/tr
        // Col - //table[@id="customers"]/tbody/tr[2]/td

        int row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();


        System.out.println(row);
        System.out.println(col);

        // //table[@id="customers"]/tbody/tr[2]/td[3]

        // first_part   - //table[@id="customers"]/tbody/tr[
        //  i
        // second -> ]/td[
        // j
        // ]

        // xpath - //table[@id="customers"]/tbody/tr[
        // i
        // ]/td[
        // j
        // ]

       String first_part = "//table[@id=\"customers\"]/tbody/tr[";
       String second_part = "]/td[";
       String third_part = "]";
        // i = 1 to 7
        // j = 1,2,3


   for (int i=2; i<=row; i++){
       for(int j=1; j<= col; j++){

           String dynamic_xpath = first_part+i+second_part+j+third_part;
           String data = driver.findElement(By.xpath(dynamic_xpath)).getText();
           System.out.println(data);

           if(data.contains("Helen Bennett")) {

               String country_path = dynamic_xpath+"/following-sibling::td";
               String country_company = dynamic_xpath+"/preceding-sibling::td";
               String country_text = driver.findElement(By.xpath(country_path)).getText();
               String company_text = driver.findElement(By.xpath(country_company)).getText();
               System.out.println("-----");
               System.out.println("Helen Bennett is In - " + country_text);
               System.out.println("Helen Bennett is Company - " + company_text);



           }


       }
   }



    }



}
