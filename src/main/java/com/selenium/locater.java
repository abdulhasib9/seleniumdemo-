package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locater {
    public static void main(String[] args) {
        System.getProperty("webdriver.chrome.driver","Users/thebeast/Documents/chromedriver/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://thecodecamp.org/login");
        driver.findElement(By.id("user_login")).sendKeys("yousufzai");
        driver.findElement(By.name("pwd")).sendKeys("hello123");
        driver.findElement(By.className("button")).click();
        //driver.findElement(By.cssSelector("input [type='submit']")).click();;
        driver.findElement(By.name("wp-submit")).click();
        System.out.println(driver.findElement(By.cssSelector("div#login_error")).getText()); 

        //for accessing the anker tag element we can specify by the content
        driver.findElement(By.linkText("Lost your password?")).click();

        //using xpath selectors
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("yousufzai");
        //implicit wait 
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10, 0));
      //  driver.quit();

      //more practice on xpath
        driver.findElement(By.linkText("login")).click();
    }
}
