package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class General extends Global {
	
	//-- to provide all re-usble methods and functions across the application
	public void openApplication() {
		System.out.println("Application Opened");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		System.out.println("Application Opened Successfully");
		
	}
	
	
	public void closeApplication() {
		System.out.println("Application Closed");
		driver.quit();
	}
	
	public void login() {
		driver.findElement(By.name(textbox_username)).sendKeys(un);
		driver.findElement(By.name(textbox_password)).sendKeys(pw);
		driver.findElement(By.name(button_login)).click();
		System.out.println("Login Completed");
		
		System.out.println("Login to Application Successful");
	}
	public void logout() {
				
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout successful");
	}
	
	public void enterFrame() {
		
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into Frame");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("Exited from Frame");
	}
	public void addNewEmp() throws Exception {
		
		
		System.out.println("Add Employee Completed");
		
		
		driver.findElement(By.xpath(button_add )).click();
		driver.findElement(By.name(textbox_empfirstname)).sendKeys(efn);
		driver.findElement(By.name(textbox_emplastname)).sendKeys(eln);
		driver.findElement(By.id(button_save)).click();
		System.out.println("New Employee Added");
			
		System.out.println("Add New Employee Successful");
	}
	public void SearchEmp() throws Exception {
		
		
		System.out.println("Searching Employee Started");

        Select s = new Select(driver.findElement(searchByDropdown));
        s.selectByIndex(2);   // Emp First Name

        driver.findElement(searchInput).clear();
        driver.findElement(searchInput).sendKeys("suresh");
        Thread.sleep(3000);

        driver.findElement(searchButton).click();
        
        System.out.println("Search Employee Successful");
	}

}
