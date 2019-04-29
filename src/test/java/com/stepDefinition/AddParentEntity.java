package com.stepDefinition;

import java.io.IOException;

import com.Base.Base;
import com.Pages.AddEntitypage;
import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Utilities.Screenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddParentEntity extends Base {
	
	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	public AddEntitypage aep;

	public AddParentEntity() throws Exception {
		super();
	
	}
	
	@Before("@Seventh")
	public void setUp() throws Exception{
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		ent = home.EntityTest();
		
		aep = ent.AddParentEntity();
		
	}
	
	
	@Given("^Enter the data in entity field \"([^\"]*)\"$")
	public void Enter_the_data_in_entity_field(String arg1) throws Throwable {
	    
		
		aep.EntityName(arg1);
		
	}
	
	@When("^Enter the data in Entity Short Name\\(Opt\\) \"([^\"]*)\"$")
	public void Enter_the_data_in_Entity_Short_Name_Opt(String arg1) throws Throwable {
	    
		aep.EntityShortName(arg1);
		
	}

	@When("^Select the data in Entity Type\\(Opt\\)$")
	public void Select_the_data_in_Entity_Type_Opt() throws Throwable {
	   
		aep.EntityTypeDropdown();
		
	}

	@When("^Select the data in Business Unit\\(Opt\\)$")
	public void Select_the_data_in_Business_Unit_Opt() throws Throwable {
	    
		aep.BusinessUnitDropdown();
		
	}

	@When("^Select the data in Site function\\(Opt\\)$")
	public void Select_the_data_in_Site_function_Opt() throws Throwable {
	    
		aep.SiteFunctionDropDown();
		
	}

	@When("^Select the Status$")
	public void Select_the_Status() throws Throwable {
	   
		aep.SiteDropDown();
		
		
	}

	@When("^Select Is a Site$")
	public void Select_Is_a_Site() throws Throwable {
	   
		aep.IsSiteDropDown();
		
	}

	@When("^Enter the Address$")
	public void Enter_the_Address() throws Throwable {
	    
		aep.Address();
		
	}

	@When("^Enter the Contact number$")
	public void Enter_the_Contact_number() throws Throwable {
	   
		aep.Contacts();
		
	}


@When("^Enter the Fax \\(Opt\\) \"([^\"]*)\"$")
public void Enter_the_Fax_Opt(String arg1) throws Throwable {
    
	aep.Fax(arg1);
	
}

	@When("^Select the Country$")
	public void Select_the_Country() throws Throwable {
	    
		aep.Country();
		
	}

	@When("^Enter the Branch Number\\(Opt\\) \"([^\"]*)\"$")
	public void Enter_the_Branch_Number_Opt(String arg1) throws Throwable {
	   
		aep.Branchnumber(arg1);
		
	}

	@When("^Select the currency$")
	public void Select_the_currency() throws Throwable {
	   
		aep.Currency();
		
	}

	@When("^Select route$")
	public void Select_route() throws Throwable {
	  
		aep.Route();
		
	}

	@When("^Add Contact Person$")
	public void Add_Contact_Person() throws Throwable {
	   
		aep.addContactPerson();
	  
	}

	@When("^Click Primary Contact person$")
	public void Click_Primary_Contact_person() throws Throwable {
	    
	    aep.PrimaryContact();
		
	}
	
	@Then("^Click on save button$")
	public void Click_on_save_button() throws Throwable {
	    
		
		aep.SaveBtn();
		
	}
	
	@Given("^Enter the data in Entity name \"([^\"]*)\"$")
	public void Enter_the_data_in_Entity_name(String arg1) throws Throwable {
	   
		aep.EntityName(arg1);
		
	}

	@When("^Enter the data in Entity shortname \"([^\"]*)\"$")
	public void Enter_the_data_in_Entity_shortname(String arg1) throws Throwable {
	
		
		aep.EntityShortName(arg1);
		
	}

	@When("^Select Entity type data$")
	public void Select_Entity_type_data() throws Throwable {
	 
		aep.EntityTypeDropdown();
		
	}
	
	@When("^Select business Unit data$")
	public void Select_business_Unit_data() throws Throwable {
	    
		aep.BusinessUnitDropdown();
		
	}

	@When("^Select site function data$")
	public void Select_site_function_data() throws Throwable {
	    
		aep.SiteFunctionDropDown();
		
	}

	@When("^Change the status to Inactive$")
	public void Change_the_status_to_Inactive() throws Throwable {
	   
		aep.IsSiteInActive();
		
	}

	@When("^Change the site to Yes$")
	public void Change_the_site_to_Yes() throws Throwable {
	  
		aep.IsSiteDropDown();
		
	}

	@Then("^click on save$")
	public void click_on_save() throws Throwable {
	    
		aep.SaveBtn();
		
	}
	
	@Then("^Validate the error messsage in Entity$")
	public void Validate_the_error_messsage_in_Entity() throws Throwable {
	    
		aep.getErrorMessage();
		
	}
	
	
	@After("@Seventh")
	public void tearDown(Scenario scenario) throws IOException{
		
		Screenshot.failedScreenshots(scenario);
		
		driver.quit();
	}

}
