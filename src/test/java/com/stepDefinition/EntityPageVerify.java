package com.stepDefinition;
import java.io.IOException;

import com.Base.Base;
import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Utilities.Screenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;


public class EntityPageVerify extends Base {

	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	
	
	public EntityPageVerify() throws Exception {
		super();
		
	}

	@Before("@Third")
	public void setUp() throws Exception{
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		ent = home.EntityTest();
		
		
	}
	
	
	@Given("^Click on Entity Type Button$")
	public void Click_on_Entity_Type_Button() throws Exception{
		
		ent.EntityButton();
		
	}
	
	
	@Given("^Click on BusinessUnit Button$")
	public void Click_on_BusinessUnit_Button() throws Exception{
		
		ent.BusinessUnitTest();
		
	}
	
	@Given("^Click on SiteFunction Button$")
	public void Click_on_SiteFunction_Button() throws Exception{
		
		ent.siteFunctionTest();
	}
	
	@Given("^Click the Parent Entity in LHS$")
	public void Click_the_Parent_Entity_in_LHS() throws Throwable {
	    ent.RightClick();
	}
	
	@Given("^Click on Add parent Entity$")
	public void Click_on_Add_parent_Entity() throws Exception{
		
		ent.AddParentEntity();
		
	}
	
	@Given("^Right click on Entity and click on New Entity$")
	public void Right_click_on_Entity_and_click_on_New_Entity()throws Exception{
		
		ent.NewEntity();
		
	}
	
	@After("@Third")
	public void tearDown(Scenario scenario) throws IOException{
		
		Screenshot.failedScreenshots(scenario);
		
		driver.quit();
	}
	
}
