package com.generic;

import org.openqa.selenium.WebDriver;

public class PojoClassOfBookMyShow {
	static WebDriver driver;
	WrapperFunctionsOfBookMyShow objWrapperFunctionsOfBookMyShow;
	
	
	//Getter method for driver
	public WebDriver getDriver()
	{
		return driver;
	}
	
	//setter method for driver
	public void setDriver(WebDriver driver)
	{
		driver = this.getDriver();
	}
	
	public WrapperFunctionsOfBookMyShow getWrapper() {
		return objWrapperFunctionsOfBookMyShow;

}

}
