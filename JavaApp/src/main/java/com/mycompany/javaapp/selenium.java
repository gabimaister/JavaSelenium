/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.javaapp;

import java.time.Duration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Gabriel
 */
public class selenium {
    
     
    public WebDriver driver;

    @Test
    public void eightComponents() {
          System.setProperty("webdriver.chrome.driver", "C:/xampp/htdocs/TestareJavaLSEG/selenium/chromedriver/chromedriver.exe");
         
      
        driver = new ChromeDriver();

        driver.get("https://selenium.dev");

        String title = driver.getTitle();
        Assertions.assertEquals("selenium", title);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        String value = searchBox.getAttribute("value");
        Assertions.assertEquals("Selenium", value);

        driver.quit();
    }
}