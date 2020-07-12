package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("before executing any method in the class");		
	}
	
	@Parameters({"URL"})
	@Test
	public void WebloginCarloan(String urlname)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);	
	}
	@Test(timeOut=4000)
	public void WebloginCarloan()
	{
		//selenium
		System.out.println("weblogincar");
	}
	@BeforeMethod
	public void beforeevery()
	{
		//selenium
		System.out.println("I will execute before every test method in day 3 class");
	}

	@BeforeClass
	public void beforclass()
	{
		System.out.println("before executing any method in the class");		
	}
	@AfterClass
	public void afterclass()
	{
		//selenium
		System.out.println("After executing all methods in the class");
	}
	@Test(groups= {"Smoke"})
	public void MobileloginCarloan()
	{
		//appium
		System.out.println("Mobile Signin");
	}
	

	@BeforeSuite
	public void Bfsuite()
	{
		System.out.println("I am no 1");
	}
	@Test(dependsOnMethods={"WebloginCarloan","Mobilesignoutcarloan"})
	public void APIcarloan()
	{
		//Rest API automation
		System.out.println("APIlogincar");
	}
}
