package com.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;

import cucumber.api.DataTable;

public class FolderTagsPage extends Base {

	public FolderTagsPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	@FindBy(css="a[role='link']")
	WebElement Header;
	
	@FindBy(id="Detailview")
	WebElement frames;

	@FindBy(css="input[value='Add']")
	WebElement Add;
	
	@FindBy(xpath="//input[@class='editable']")
	WebElement Grid;
	
	@FindBy(id="FldrTagsGrid_ilsave")
	WebElement save;
	
	@FindBy(id="popup_ok")
	WebElement PopUpOk;
	
	@FindBy(id="popup_message")
	WebElement popmsg;
	
	@FindBy(xpath="//td[contains(text(),'tag A')]//parent::td//preceding-sibling::td//input[@role='checkbox']")
	WebElement DynamicTable;

	//------------------failed---------------------
	@FindBy(id="txtLevelName")
	WebElement LevelName;
	
	//------------------Delete------------------------
	
	@FindBy(xpath="//td[contains(text(),'Tag B')]//parent::td//preceding-sibling::td//input[@role='checkbox']")
	WebElement Checkbox;
	
	@FindBy(className = "btn btn-mini btn-danger")
	WebElement DeleteBtn;
	
	//--------------------Edit------------------------------
	
	@FindBy(xpath="//td[contains(text(),'Tag C')]//parent::td//preceding-sibling::td//input[@role='checkbox']")
	WebElement CheckboxEdit;
	
	@FindBy(id="btn_FldrTagsGrid_iledit")
	WebElement EditBtn;
	
	@FindBy(className="editable")
	WebElement TextEditable;

	

	public void AddTag() throws InterruptedException {

	driver.switchTo().frame(frames);
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Header, driver);
	HighlightFailedElements.drawBorder(Header, driver);
	
	if(Header.isDisplayed()) {
		
		Thread.sleep(3000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Add, driver);
		HighlightFailedElements.drawBorder(Add, driver);
		
		Add.click();
		
		Thread.sleep(5000);
		
	}else {
		
		//HighlightFailedElements.changeColor("rgb(0,200,0)", Header, driver);
		//HighlightFailedElements.drawBorder(Header, driver);
		
		System.out.println("No Header");
		//wantedly failing the scenario
		LevelName.click();
		
		
	}
	
	
	
	}
	
	public void saveTag(String arg1) throws InterruptedException {
		
		if(Grid.isEnabled()) {
			
			HighlightFailedElements.changeColor("rgb(0,200,0)", Grid, driver);
			HighlightFailedElements.drawBorder(Grid, driver);
			
			Grid.sendKeys(arg1);
			
			Thread.sleep(5000);
			
			HighlightFailedElements.changeColor("rgb(0,200,0)", save, driver);
			HighlightFailedElements.drawBorder(save, driver);
			
			save.click();
			
			Thread.sleep(3000);
			
			HighlightFailedElements.changeColor("rgb(0,200,0)", popmsg, driver);
			HighlightFailedElements.drawBorder(popmsg, driver);
			
			String s = popmsg.getText();
			
			System.out.println("Popup message::"+s);
			
			HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
			HighlightFailedElements.drawBorder(PopUpOk, driver);
			
			PopUpOk.click();
			
			Thread.sleep(3000);
			
			
		} else {
			
			System.out.println("Grid is not working");
			
			LevelName.click();
		}
		
		
		
	}
	
	//---------------------Delete Tag---------------------------------------------------------------
	
	public void checkbox() throws InterruptedException {
		
		driver.switchTo().frame(frames);
		
		Checkbox.click();
		
		Thread.sleep(3000);

	}
	
	public void DeleteBtn() {
		
		DeleteBtn.click();
		
		
	}
	
	//------------------------Edit Tag-----------------------------------------------------------------
	
	public void EditBtn() throws InterruptedException {
		
		driver.switchTo().frame(frames);
		
		EditBtn.click();
		
		Thread.sleep(3000);
		
	}
	
	public void CheckboxClick() {
		
		CheckboxEdit.click();

	}
	
	public void EditData(String arg1) throws InterruptedException {
		
		TextEditable.clear();
		TextEditable.sendKeys(arg1);
		
		save.click();
		
		Thread.sleep(5000);
		
	}



}
