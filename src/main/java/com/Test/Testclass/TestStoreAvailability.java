package com.Test.Testclass;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;

import walmartHomepage.StoreAvailability;

public class TestStoreAvailability extends BaseClass1 {

	StoreAvailability store2;
	

	@BeforeClass
	public void before() {
		 store2 = new StoreAvailability(driver);
	}

	@Test
	public void TestStoreLocation() throws InterruptedException {

		String tt = store2.Storeavailability1();
		Assert.assertEquals(5, tt);

	}
}