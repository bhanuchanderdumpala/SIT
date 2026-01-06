package com.hrms.tesscripts;
import com.hrms.lib.General;

public class TC001 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Test Case 001 executed");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
		

	}

}
