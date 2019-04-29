package com.stepDefinition;

import java.io.IOException;

import com.Base.Base;
import com.Pages.EntityPage;
import com.Pages.HomePage;
import com.Pages.LoginPage;
import com.Pages.NewEntityPage;
import com.Utilities.Screenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewEntityPageVerify extends Base {
	
	public LoginPage login;
	public HomePage home;
	public EntityPage ent;
	public NewEntityPage ne;
	

	public NewEntityPageVerify() throws Exception {
		super();
		
	}
	
	@Before("@Eight")
	public void SetUp() throws Exception{
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		ent = home.EntityTest();
		
		ne = ent.NewEntity();
	
	}
	
	@Given("^In Entity name field enter the data \"([^\"]*)\"$")
	public void In_Entity_name_field_enter_the_data(String arg1) throws Throwable {
	  
		ne.EntityName(arg1);
		
	}

	@When("^In Entity Short name field enter the data \"([^\"]*)\"$")
	public void In_Entity_Short_name_field_enter_the_data(String arg1) throws Throwable {
	  
		ne.EntityShortName(arg1);
		
	}

	@When("^Click on Entity Type dropdown and select the data$")
	public void Click_on_Entity_Type_dropdown_and_select_the_data() throws Throwable {
	    
		ne.EntityTypeDropdown();
		
	}

	@When("^Click on BusinessUnit dropdown and select the data$")
	public void Click_on_BusinessUnit_dropdown_and_select_the_data() throws Throwable {
	   
		ne.BusinessUnitDropdown();
		
	}

	@When("^Click on SiteFunction dropdown and select the data$")
	public void Click_on_SiteFunction_dropdown_and_select_the_data() throws Throwable {
	   
		ne.SiteFunctionDropDown();
		
	}

	@When("^Change the status of entity to InActive$")
	public void Change_the_status_of_entity_to_InActive() throws Throwable {
	   
		ne.IsSiteInActive();
		
	}

	@When("^Change the status of site to Yes$")
	public void Change_the_status_of_site_to_Yes() throws Throwable {
	   
		ne.IsSiteDropDown();
		
	}

	@Then("^save the entity$")
	public void save_the_entity() throws Throwable {
	   
		ne.SaveBtn();
		
	}

	@Then("^get the error message from entity page$")
	public void get_the_error_message_from_entity_page() throws Throwable {
	   
		ne.getErrorMessage();
		
	}
	
	//--------------------------------------------------------------------------
	
	@Given("^Enter the data in Entity name field \"([^\"]*)\"$")
	public void Enter_the_data_in_Entity_name_field(String arg1) throws Throwable {
	    
		ne.EntityName(arg1);
		
		
	}

	@When("^Enter the data in Entity short name field \"([^\"]*)\"$")
	public void Enter_the_data_in_Entity_short_name_field(String arg1) throws Throwable {
	   
		
		ne.EntityShortName(arg1);
		
	}

	@When("^Select the data from Entity type$")
	public void Select_the_data_from_Entity_type() throws Throwable {
	   
		ne.EntityTypeDropdown();
		
	}

	@When("^Select the data from Business Unit$")
	public void Select_the_data_from_Business_Unit() throws Throwable {
	
		ne.BusinessUnitDropdown();
		
	}
	
	@When("^Select the data from Site Unit$")
	public void Select_the_data_from_Site_Unit() throws Throwable {
	    
		ne.SiteFunctionDropDown();
		
	}
	@When("^Select the Status in Entity page$")
	public void Select_the_Status_in_Entity_page() throws Throwable {
	    
		ne.SiteDropDown();
		
	}

	@When("^Select Is a site in Entity page$")
	public void Select_Is_a_site_in_Entity_page() throws Throwable {
	   
		ne.IsSiteDropDown();
		
	}

	@When("^Enter the address in Entity page$")
	public void Enter_the_address_in_Entity_page() throws Throwable {
	   
		ne.Address();
		
	}

	@When("^Enter the contact number in Entity page \"([^\"]*)\"$")
	public void Enter_the_contact_number_in_Entity_page(String arg1) throws Throwable {
	    
		ne.Contacts(arg1);
		
	}

	@When("^Enter the fax \"([^\"]*)\"$")
	public void Enter_the_fax(String arg1) throws Throwable {
	   
		ne.Fax();
		
	}

	@When("^Select the country state and city$")
	public void Select_the_country_state_and_city() throws Throwable {
	   
		ne.Country();
		
	}

	@When("^Enter the branch number in Entity page \"([^\"]*)\"$")
	public void Enter_the_branch_number_in_Entity_page(String arg1) throws Throwable {
	    
		ne.Branchnumber();
		
	}

	@When("^Select the currency in Entity page$")
	public void Select_the_currency_in_Entity_page() throws Throwable {
	   
		ne.Currency();
		
	}

	@When("^Select the Route in Entity page$")
	public void Select_the_Route_in_Entity_page() throws Throwable {
	  
		ne.Route();
		
	}

	@When("^Add contact person for new Entity creation$")
	public void Add_contact_person_for_new_Entity_creation() throws Throwable {
	 
		ne.addContactPerson();
		
		
	}

	@When("^Click contact person$")
	public void Click_contact_person() throws Throwable {
	
		
		ne.PrimaryContact();
		
	}

	@Then("^Click on save button in new Entity creation page$")
	public void Click_on_save_button_in_new_Entity_creation_page() throws Throwable {
	  
		ne.SaveBtn1();
		
	}
	//-----------------------------------------------------------------------
	
	@Given("^Click on Created Entity$")
	public void Click_on_Created_Entity() throws Throwable {
	    
		ne.CreatedEntity();
		
		
	}
	
	//------------------------------------------------------------------------
	
	@Given("^Click on Created entity and right Click on it$")
	public void Click_on_Created_entity_and_right_Click_on_it() throws Throwable {
	    
		ne.CreatedEntity();
		
		
	}

	@When("^Click on Delete$")
	public void Click_on_Delete() throws Throwable {
	   
		ne.CreatedEntityDelete();
		
	}

	@Then("^Click on yes on Delete Confirmation$")
	public void Click_on_yes_on_Delete_Confirmation() throws Throwable {
	    
		ne.deleteConfirmation();
		
	}
	
	
	@After("@Eight")
	public void tearDown(Scenario scenario) throws IOException{

		Screenshot.failedScreenshots(scenario);
		
		driver.quit();
	}
	

}
