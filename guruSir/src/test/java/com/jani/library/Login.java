package com.jani.library;

import org.openqa.selenium.By;

import com.jani.Utils.AppUtils;

public class Login extends AppUtils
 {
	
	public void login(String userId, String password)
	{
		// AppUtils.driver.findElement(By.id("")).sendKeys(userId); //inheritence
		
		driver.findElement(By.id("txtUsername")).sendKeys(userId);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}

	public boolean isAdminModuldDisplayed()
	{
		if(driver.findElement(By.linkText("Admin")).isDisplayed())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isErrorMsgDisplayedWhenInvalidLogin()
	{
		String errorMsg = driver.findElement(By.id("spanMessage")).getText();
		
		if(errorMsg.toLowerCase().contains("invalid "))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isEmployeeModulDisplayedOrNot()
	{
		try
		{
			driver.findElement(By.linkText("Admin")).isDisplayed();
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	public void logOut()
	{
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		
	}
}
