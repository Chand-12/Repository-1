package com.newgen.testng;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnotation {
	
	
	@Test(dataProvider = "cat1")
	public void Nisha(Integer n, String S, char c ) {
		System.out.println("Test method executed with data provider! "  + n + " :" +S+ ":" +c);
	}
	
	@Test(dataProvider= "datasupply")
	public void Seema(String s) {
		System.out.println("Test data:"  +s);
	}
	
	@DataProvider
	public Object[] datasupply(){
		return new Object[] {"Chanda"};
	}
	
    @DataProvider
	public Object[][] cat1(){
   
		return new Object[][] {new Object[] {2, "a", 'b'} , new Object[] {5,"c", 'v'} , new Object[] {6,"d",'g'} };
	}

}
