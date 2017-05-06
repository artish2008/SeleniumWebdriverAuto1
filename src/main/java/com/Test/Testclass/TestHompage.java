package com.Test.Testclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;

import walmartHomepage.Homepage;

public class TestHompage extends BaseClass1 {

	Homepage home;

	@BeforeClass
	public void before() {
		home = new Homepage(driver);
	}

	@Test
	public void TestNavlinks() {

		Assert.assertEquals(5, home.findHomePagelinks());
	}

	/*
	 * @Test public void TestSignINClick(){ Homepage home=new Homepage(driver);
	 * home.checksignINlink();
	 * 
	 * Assert.
	 * assertEquals("Walmart.com: Free 2-Day Shipping on Millions of Items",
	 * driver.getTitle() );
	 * 
	 * }
	 */

}
