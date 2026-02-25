package com.newgen.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Annotations {
	
	@BeforeSuite
	public void setup() {
		System.out.println("Setup is done");
	}
	
	@BeforeTest
	public void Browserlaunch() {
		System.out.println("Browser is launched");
		//Assert.assertTrue(false);
		Assert.assertFalse(false);
	}
	
	@BeforeClass
	public void Applicationlaunch() {
		System.out.println("Application is launched");
 
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("login 1st");
	}
	

	@Test(dataProvider = "cat1")
	public void test01(Integer n, String S) {
		System.out.println("Test method executed with data provider! "  + n + " :" +S);
	}
	
	@Test( )
	public void show() {
		System.out.println("Welcome to TestNG");
//	SoftAssert sa = new SoftAssert();
//	sa.assertTrue(false);
//	sa.assertAll();
//		sa.assertFalse(false);
//		
//		System.out.println("all steps are completed");
//		sa.assertAll();	 
	}
	

	@Test()
	public void write() {
		System.out.println("I like eassay writing");
//     	SoftAssert sa = new SoftAssert();
//		sa.assertTrue(false);
//		sa.assertAll();
		//System.out.println("I like eassay writing");
	}
	
	@DataProvider
	public Object[][] cat1(){
		return new Object[][] {new Object[] {2, "a"} , new Object[] {5,"c"},};
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Logout");
	}
	
	@AfterClass
	public void ApplicationExit() {
		System.out.println("Application is closed");
		
	}
	
	@AfterTest
	public void BrowserClosed() {
		System.out.println("Browser is closed");
	}
	
	@AfterSuite
	public void setupClosed() {
		System.out.println("Setup is closed");
	}
	
	
	

	
	
	

}
