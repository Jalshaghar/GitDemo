package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void WebloginCarloan()
	{
		//selenium
		System.out.println("webloginhome");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarloan()
	{
		//appium
		System.out.println("mobileloginhome");
	}
	
	@Test
	public void LoginAPIcarloan()
	{
		//Rest API automation
		System.out.println("APIloginhome");
	}
}