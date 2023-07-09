package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        System.getProperty("webdriver.chrome.driver","Users/thebeast/Documents/chromedriver/chromedriver");
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://thecodecamp.org/login");
        //chromeDriver.getTitle();
        System.out.println(chromeDriver.getTitle());
        System.out.println(chromeDriver.getCurrentUrl());
        
        //chromeDriver.close();//this will close only current window 
       // chromeDriver.quit();//this will close all accociated windows 

        
    }
}
