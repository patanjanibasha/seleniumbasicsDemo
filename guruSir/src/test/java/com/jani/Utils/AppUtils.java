package com.jani.Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AppUtils
{
	public static ChromeDriver driver = new ChromeDriver();
	public static  String url="http://orangehrm.qedgetech.com";
	

	public static void setUp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void LaunchApplication(String url)
	{
		setUp();
		driver.get(url);
	}
	
	public static void CloseApplication()
	{
		driver.close();
	}

}
