package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass1 {

	
	protected WebDriver driver;
	
	@BeforeClass	
	public void beforeclass(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Arti\\workspace1\\walmart12\\Resources\\chromedriver.exe" );
		driver= new ChromeDriver();
		//driver.get("https://www.walmart.com/");
		
	}
}
