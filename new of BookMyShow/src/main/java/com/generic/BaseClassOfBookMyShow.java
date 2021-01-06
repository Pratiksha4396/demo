package com.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClassOfBookMyShow extends PojoClassOfBookMyShow{
	PojoClassOfBookMyShow objInitializeTearDownEnviromentPojo;
	
	public void initializeEnvoirment()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(" https://in.bookmyshow.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		objWrapperFunctionsOfBookMyShow = new WrapperFunctionsOfBookMyShow(this);
}

}
