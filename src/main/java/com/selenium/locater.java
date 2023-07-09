package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class locater {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","Users/thebeast/Documents/chromedriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thecodecamp.org/login");
    }
}
