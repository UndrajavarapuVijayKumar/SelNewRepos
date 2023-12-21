package com.metlife.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
            //google
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());
        driver.close();
            //facebook
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://facebook.com");
        System.out.println(driver.getTitle());
        driver1.close();
    }
}
