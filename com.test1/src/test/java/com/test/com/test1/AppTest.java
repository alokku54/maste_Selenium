package com.test.com.test1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AppTest 
{
	public static void main(String[] args) {  
		
		System.setProperty("webdriver.chrome.driver", "/Users/alokkumar/eclipse-workspace/com.test1/src/test/chromedriver");
		WebDriver driver=new ChromeDriver();
		  
		   driver.manage().window().maximize();
		   

		//open browser with desried URL
		driver.get("https://www.google.com");

		//closing the browser
		driver.close();    

 }  

 
}
