package com.Pages;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.Base.Base;
import com.Utilities.BrokenLinks;
import com.Utilities.HighlightFailedElements;
import com.Utilities.waitdriver;

public class HomePage extends Base {
	
	public HomePage() throws Exception{
		
		//super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	//---------Entity Icon ---------------------
	@FindBy(xpath="//a[@title='Entity']")
	WebElement Entity;
	
	//---------Modules Icon ---------------------
	@FindBy(xpath="//a[@title='Modules']")
	WebElement Modules;
	
	//---------Site Administrator Icon ---------------------
	@FindBy(xpath="//a[@title='Site Administrator']")
	WebElement SiteAdministrator;
	
	//---------Project Pillar Icon ---------------------
	@FindBy(xpath="//a[@title='Project Pillar']")
	WebElement ProjectPillar;
	
	//---------Process/Activities Icon ---------------------
	@FindBy(xpath="//a[@title='Process / Activities']")
	WebElement ProcessActivities;
	
	//---------Levels Icon ---------------------
	@FindBy(xpath="//a[@title='Levels']")
	WebElement Levels;
	
	//---------Master Folder Tags Icon ---------------------
	@FindBy(xpath="//a[@title='Master Folder Tags']")
	WebElement MasterFolderTags ;
	
	//---------Create Department Icon ---------------------
	@FindBy(xpath="//a[@title='Create Department']")
	WebElement CreateDepartment ;
	
	//---------Assign Department Icon ---------------------
	@FindBy(xpath="//a[@title='Assign Department']")
	WebElement AssignDepartment ;
	
	//---------Logout Image Icon ---------------------
	@FindBy(className="round_img")
	WebElement logoutImg;
	
	//---------Logout Dropdown ---------------------
	@FindBy(id="logout")
	WebElement logout;
	
	//It will Find all the Broken Links in the current page -----> Refer the code in com.Utilities/BrokenLinks
	public void BrokenLinksVerify() throws MalformedURLException, IOException, InterruptedException{
		
		BrokenLinks.Broken();
		
		
	}
	
	//Entity Icon Click Functionality
	public EntityPage EntityTest() throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Entity, driver);
		HighlightFailedElements.drawBorder(Entity, driver);
		
		Entity.click();
		
		return new EntityPage();
	}
	
	//Modules Icon Click Functionality
	public ModulesPage ModuleTest()throws Exception{
		
		Modules.click();
		
		return new ModulesPage();
		
	}
	
	//Site Admin Icon Click Functionality
	public SiteAdminPage SiteAdminTest()throws Exception{
		
		SiteAdministrator.click();
		
		return new SiteAdminPage();
		
	}
	
	//Project Pillar Icon Click Functionality
	public ProjectPillarPage ProjectPillarTest()throws Exception{
		
		ProjectPillar.click();
		
		return new ProjectPillarPage();
		
	}
	
	//Process/Activities Icon Click Functionality
	public ProcessPage ProcessTest()throws Exception{
		
		ProcessActivities.click();
		
		return new ProcessPage();
		
	}
	
	//Levels Icon Click Functionality
	public LevelsPage LevelsTest() throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Levels, driver);
		HighlightFailedElements.drawBorder(Levels, driver);
		
		Levels.click();
		
		Thread.sleep(5000);
		
		return new LevelsPage();
		
	}
	
	//Master Folder Tags Icon Click Functionality
	public FolderTagsPage FolderTagstest()throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", MasterFolderTags, driver);
		HighlightFailedElements.drawBorder(MasterFolderTags, driver);
		
		MasterFolderTags.click();
		
		return new FolderTagsPage();
		
	}
	
	//Create Department Icon Click Functionality
	public CreateDepartmentPage CreateDepartmentTest()throws Exception{
		
		CreateDepartment.click();
		
		return new CreateDepartmentPage();
		
	}
	
	//Assign Department Icon Click Functionality
	public AssignDepartmentPage AssignDepartmentTest()throws Exception{
		
		AssignDepartment.click();
		
		return new AssignDepartmentPage();
		
	}
	
	//Logout Functionality
	public LoginPage Logout() throws Exception{
		Thread.sleep(4000);
		
		logoutImg.click();
		
		Thread.sleep(5000);
		
		logout.click();
		
		Thread.sleep(5000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		
		return new LoginPage();
		
		
	}
	
	
}

	
	