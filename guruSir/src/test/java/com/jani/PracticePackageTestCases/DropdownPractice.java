package com.jani.PracticePackageTestCases;

import com.jani.PracticePackageTestCases.DropdownPractice;
import com.jani.Utils.PracticeUtils;
import com.jani.gurusir.guruSir.DropDownDemo;

public class DropdownPractice extends PracticeUtils{

	public static void main(String[] args) {
		
		LaunchApplication("https://letcode.in/dropdowns");
		DropDownDemo ddl = new DropDownDemo();
		ddl.selectByIndex(3);
		ddl.selectByVisibleText("Banana");
		
		
	}

}
