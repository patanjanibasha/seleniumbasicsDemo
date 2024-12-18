package com.jani.TestCases;

import com.jani.Utils.AppUtils;
import com.jani.library.Login;

public class LoginwithValidInputsTestCase extends AppUtils{

	public static void main(String[] args) {
		
		LaunchApplication(url);
		Login lg = new Login();
		lg.login("admin", "Qedge123!@#");
		CloseApplication();
	}

}
