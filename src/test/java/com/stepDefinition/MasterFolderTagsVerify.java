package com.stepDefinition;

import java.io.IOException;

import com.Base.Base;
import com.Pages.FolderTagsPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Utilities.Screenshot;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class MasterFolderTagsVerify extends Base {

	public LoginPage login;
	public HomePage home;
	public FolderTagsPage tags;
	
	
	public MasterFolderTagsVerify() throws Exception {
		super();
	}
	
	@Before("@Tenth")
	public void setup() throws Exception {
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		tags = home.FolderTagstest();
		
		
		
	}
	
	
	@Given("^Click on Add button in Folder tags$")
	public void Click_on_Add_button_in_Folder_tags() throws Throwable {
	   
		tags.AddTag();
		
		
	}
	
	
	@When("^Send data in Folder Tag grid \"([^\"]*)\" and save$")
	public void Send_data_in_Folder_Tag_grid_and_save(String arg1) throws Throwable {
	    
		tags.saveTag(arg1);
		
	}
	
	//-----------------Delete Tag--------------------------------------------------------
	
	@Given("^Click on checkbox which data should be deleted$")
	public void Click_on_checkbox_which_data_should_be_deleted() throws Throwable {
	    
		tags.checkbox();
		
		
	}

	@When("^Delete the Tag$")
	public void Delete_the_Tag() throws Throwable {
	    
		
		tags.DeleteBtn();
		
		
	}
	
	//-----------------------------Edit Tag-----------------------
	
	@Given("^Click on Checkbox$")
	public void Click_on_Checkbox() throws Throwable {
	  
		tags.CheckboxClick();
		
	}

	@When("^Click on Edit button in Master Folder Tags$")
	public void Click_on_Edit_button_in_Master_Folder_Tags() throws Throwable {
	    
		tags.EditBtn();
		
	}

	@When("^Edit the text \"([^\"]*)\"  and save it$")
	public void Edit_the_text_and_save_it(String arg1) throws Throwable {
	   
		tags.EditData(arg1);
		
	}

	
	@After("@Tenth")
	public void teardown(Scenario scenario) throws IOException {
		
		Screenshot.failedScreenshots(scenario);
		
		driver.quit();
		
	}

}
