package com.jani.gurusir.guruSir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jani.Utils.PracticeUtils;

public class DropDownDemo extends PracticeUtils{

	public void selectByIndex(int ind)
	{
		WebElement fruitsddl = driver.findElement(By.id("fruits"));
		Select ddl = new Select(fruitsddl);
		ddl.selectByIndex(ind);
	}
	
	
	public void selectByVisibleText(String txt)
	{
		WebElement fruitsddl = driver.findElement(By.id("fruits"));
		Select ddl = new Select(fruitsddl);
		ddl.selectByVisibleText(txt);
	}
	
	public void selectByVisibleText(String txt)
	{
		WebElement fruitsddl = driver.findElement(By.id("fruits"));
		Select ddl = new Select(fruitsddl);
		ddl.
	}
}
