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
	
	@FindBy(xpath="//a[@title='Entity']")
	WebElement Entity;
	
	@FindBy(xpath="//a[@title='Modules']")
	WebElement Modules;
	
	@FindBy(xpath="//a[@title='Site Administrator']")
	WebElement SiteAdministrator;
	
	@FindBy(xpath="//a[@title='Project Pillar']")
	WebElement ProjectPillar;
	
	@FindBy(xpath="//a[@title='Process / Activities']")
	WebElement ProcessActivities;
	
	@FindBy(xpath="//a[@title='Levels']")
	WebElement Levels;
	
	@FindBy(xpath="//a[@title='Master Folder Tags']")
	WebElement MasterFolderTags ;
	
	@FindBy(xpath="//a[@title='Create Department']")
	WebElement CreateDepartment ;
	
	@FindBy(xpath="//a[@title='Assign Department']")
	WebElement AssignDepartment ;
	
	@FindBy(className="round_img")
	WebElement logoutImg;
	
	@FindBy(id="logout")
	WebElement logout;
	
	public void BrokenLinksVerify() throws MalformedURLException, IOException, InterruptedException{
		
		BrokenLinks.Broken();
		
		
	}
	public EntityPage EntityTest() throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Entity, driver);
		HighlightFailedElements.drawBorder(Entity, driver);
		
		Entity.click();
		
		return new EntityPage();
	}

	public ModulesPage ModuleTest()throws Exception{
		
		Modules.click();
		
		return new ModulesPage();
		
	}
	
	public SiteAdminPage SiteAdminTest()throws Exception{
		
		SiteAdministrator.click();
		
		return new SiteAdminPage();
		
	}
	
	public ProjectPillarPage ProjectPillarTest()throws Exception{
		
		ProjectPillar.click();
		
		return new ProjectPillarPage();
		
	}
	
	public ProcessPage ProcessTest()throws Exception{
		
		ProcessActivities.click();
		
		return new ProcessPage();
		
	}
	
	public LevelsPage LevelsTest() throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Levels, driver);
		HighlightFailedElements.drawBorder(Levels, driver);
		
		Levels.click();
		
		Thread.sleep(5000);
		
		return new LevelsPage();
		
	}
	
	public FolderTagsPage FolderTagstest()throws Exception{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", MasterFolderTags, driver);
		HighlightFailedElements.drawBorder(MasterFolderTags, driver);
		
		MasterFolderTags.click();
		
		return new FolderTagsPage();
		
	}
	
	public CreateDepartmentPage CreateDepartmentTest()throws Exception{
		
		CreateDepartment.click();
		
		return new CreateDepartmentPage();
		
	}
	
	public AssignDepartmentPage AssignDepartmentTest()throws Exception{
		
		AssignDepartment.click();
		
		return new AssignDepartmentPage();
		
	}
	
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

	
	