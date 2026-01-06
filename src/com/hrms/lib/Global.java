package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Global {
	//-- to provide all global variables across the application
	//-- Application URL
	//-- Username and Password
	//---Test Data
	public String url="https://ctcorphyd.com/SureshIT/login.php";
	public String un="sureshit";
	public String pw="sureshit";
	public String efn="Bhanu819";
	public String eln="PrakashReddy";
	
	//**** Object Locators ****
	public String textbox_username   = "txtUserName";
	public String textbox_password   = "txtPassword";
	public String button_login       = "Submit";
	public String link_logout       = "Logout";
	public WebDriver driver;
	public String frame_empinfo     = "rightMenu";	
	public String button_add         = "//input[@value='Add']";
	public String textbox_empfirstname = "txtEmpFirstName";
	public String textbox_emplastname  = "txtEmpLastName";
	public String button_save        = "btnEdit";
	public String Searchempby="loc_code"	;
	
	public By searchByDropdown = By.id("loc_code");
    public By searchInput      = By.id("loc_name");
    
    public By searchButton     = By.xpath("//input[@value='Search']");
}
