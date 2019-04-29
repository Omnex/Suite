package com.stepDefinition;

import java.io.IOException;

import com.Base.Base;
import com.Pages.HomePage;
import com.Pages.LevelsPage;
import com.Pages.LoginPage;
import com.Utilities.Screenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LevelsPageVerify extends Base {
	
	public LoginPage login;
	public HomePage home;
	public LevelsPage level;

	public LevelsPageVerify() throws Exception {
		super();
	}

	@Before("@Nine")
	public void setup() throws Exception{
		
		start();
		
		login = new LoginPage();
		
		home = login.Login();
		
		level = home.LevelsTest();
		
	}
	
	//-------------------------------Level Number Changed---------------------------
	
	@Given("^Get the Default value and change the LevelNumber \"([^\"]*)\"$")
	public void Get_the_Default_value_and_change_the_LevelNumber(String arg1) throws Throwable {
	   
		level.LevelNumber(arg1);
		
		
	}

	@When("^Enter the data in levelname \"([^\"]*)\"$")
	public void Enter_the_data_in_levelname(String arg1) throws Throwable {
	    
		level.LevelName(arg1);
		
	}

	@When("^Enter prefix name \"([^\"]*)\"$")
	public void Enter_prefix_name(String arg1) throws Throwable {
	    
		
		level.Prefix(arg1);
		
	}

	@When("^Set the Documents reviewed After \"([^\"]*)\"$")
	public void Set_the_Documents_reviewed_After(String arg1) throws Throwable {
	    
		level.DocumentReview(arg1);
		
	}

	@When("^click on check box Allow Site Modification$")
	public void click_on_check_box_Allow_Site_Modification() throws Throwable {
	    
		level.SiteModification();
		
	}

	@When("^Click on check box Allow Site Sub-levels Creation$")
	public void Click_on_check_box_Allow_Site_Sub_levels_Creation() throws Throwable {
	   
		level.SubLevelCreation();
		
	}

	@Then("^save the Level$")
	public void save_the_Level() throws Throwable {
	    
		level.savethelevel();
		
	}
	
	//---------------------Default Level Number --------------------------------
	
	@Given("^Get the Default value$")
	public void Get_the_Default_value() throws Throwable {
	    
		
		level.GetDefaultNumber();
		
	}

	@When("^Enter the datas in level name \"([^\"]*)\"$")
	public void Enter_the_datas_in_level_name(String arg1) throws Throwable {
	    
		level.LevelName(arg1);
		
	}

	@When("^Enter the data in Prefix \"([^\"]*)\"$")
	public void Enter_the_data_in_Prefix(String arg1) throws Throwable {
	 
		
		level.Prefix(arg1);
		
	}

	@When("^Set the days for documents \"([^\"]*)\"$")
	public void Set_the_days_for_documents(String arg1) throws Throwable {
	    
		level.DocumentReview(arg1);
		
	}

	@When("^Enable the checkbox for Allow site Modification$")
	public void Enable_the_checkbox_for_Allow_site_Modification() throws Throwable {
	   
		level.SiteModification();
		
	}

	@When("^Enable the checkbox for Allow Site Sub-levels Creation$")
	public void Enable_the_checkbox_for_Allow_Site_Sub_levels_Creation() throws Throwable {
	    
		level.SubLevelCreation();
		
	}

	@Then("^save$")
	public void save() throws Throwable {
	
		level.savethelevel();
		
	}
	
	//--------------------------------------Sub Level Creation-------------------------------------------------
	
	@Given("^Right Click on Created Level$")
	public void Right_Click_on_Created_Level() throws Throwable {
		
		level.LevelRightClick();
		
	}
	
	@When("^Click on New Level$")
	public void Click_on_NewLevel() throws Throwable {
		
	    
		level.newSubLevel();
		
	}

	@When("^Get parent Level name$")
	public void Get_parent_Level_name() throws Throwable {
		
	    
		level.getParentName();
		
	}
	
	@When("^Get the Value of Level Number$")
	public void Get_the_Value_of_Level_Number() throws Throwable {
		
	    
		level.GetDefaultNumber1();
		
	}
	
	@When("^Enter Level name \"([^\"]*)\"$")
	public void Enter_Level_name(String arg1) throws Throwable {
	   
		level.LevelName(arg1);
		
	}

	@When("^Enter Prefix \"([^\"]*)\"$")
	public void Enter_Prefix(String arg1) throws Throwable {
	    
		level.Prefix(arg1);
		
	}

	@When("^Set days to review the document \"([^\"]*)\"$")
	public void Set_days_to_review_the_document(String arg1) throws Throwable {
	    
		level.DocumentReview(arg1);
		
		
	}
	
	@Then("^save the sub Level$")
	public void save_the_sub_Level() throws Throwable {
	
		level.savethelevel();
		
	}
	
	//--------------------------Edit level with Changing Level Number-------------------------------
	
	@Given("^Right click on Existing level and click on edit$")
	public void Right_click_on_Existing_level_and_click_on_edit() throws Throwable {
	
		level.edit();
		
		
	}
	
	@When("^Change Level number and get Default value \"([^\"]*)\"$")
	public void Change_Level_number_and_get_Default_value(String arg1) throws Throwable {
	   
		level.editlevelnumber(arg1);
		
	}

	@When("^Edit the Level name \"([^\"]*)\"$")
	public void Edit_the_Level_name(String arg1) throws Throwable {
	 
		level.editLevelName(arg1);
		
	}

	@When("^Edit Prefix name \"([^\"]*)\"$")
	public void Edit_Prefix_name(String arg1) throws Throwable {
	    
		level.EditPrefix(arg1);
		
	}

	@When("^Edit the Document Reviewed After \"([^\"]*)\"$")
	public void Edit_the_Document_Reviewed_After(String arg1) throws Throwable {
	    
		level.DocumentReview(arg1);
		
	}

	@When("^Click on save$")
	public void Click_on_save() throws Throwable {
	   
		level.savethelevel();
		
	}
	
	//--------------------------------Edit Level with Default Number---------------------------------------
	
	@Given("^Right Click on level and edit$")
	public void Right_Click_on_level_and_edit() throws Throwable {
	    
		level.editDefaultlevel();
		
	}

	@When("^Get Default Value from level number$")
	public void Get_Default_Value_from_level_number() throws Throwable {
	   
		level.GetDefaultNumber2();
		
		
	}

	@When("^Edit the level name data \"([^\"]*)\"$")
	public void Edit_the_level_name_data(String arg1) throws Throwable {
	    
		level.editLevelName1(arg1);
		
	}

	@When("^Edit the Prefix data \"([^\"]*)\"$")
	public void Edit_the_Prefix_data(String arg1) throws Throwable {
	   
		level.EditPrefix(arg1);
		
	}

	@When("^Edit the Document Reviewed \"([^\"]*)\"$")
	public void Edit_the_Document_Reviewed(String arg1) throws Throwable {
	    
		level.DocumentReview(arg1);
		
		
	}

	@Then("^save the Edited level$")
	public void save_the_Edited_level() throws Throwable {
	    
		level.savethelevel();
		
	}
	
//------------------------------Delete Level------------------------------
	
	@Given("^Right click on the level and Click on delete$")
	public void Right_click_on_the_level_and_Click_on_delete() throws Throwable {
	 
		level.Deltelevel();
		
		
	}

	@Then("^delete the level$")
	public void delete_the_level() throws Throwable {
	    
		level.DeletePopup();
		
	}
	
	
	
	@After("@Nine")
	public void tearDown(Scenario scenario) throws IOException{
		
		Screenshot.failedScreenshots(scenario);
		
		
		driver.quit();
		
		
		
	}
	
}
