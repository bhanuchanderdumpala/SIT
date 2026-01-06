package com.hrms.tesscripts;
import com.hrms.lib.*;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;

public class TC002_AddEmp {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Test Case 002 executed");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.enterFrame();
		obj.addNewEmp();
		obj.exitFrame();
		obj.logout();
		obj.closeApplication();
		

	}

}
