package com.Test.Testclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestLinksinoneclass {

	@Test
	public void beforeclass() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Arti\\workspace1\\walmart12\\Resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		List<WebElement> links1 = driver
				.findElements(By.xpath(".//*[contains(@class,'header-GlobalEyebrowNav-link')]"));
		int result = links1.size();
		System.out.println(result);

	}

}
