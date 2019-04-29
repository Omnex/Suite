package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;
import com.Utilities.waitdriver;

import junit.framework.Assert;

public class LevelsPage extends Base {

	public LevelsPage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	
	}
	
	//---------------- Level Creation-----------------------------------------//
	@FindBy(id="txtLevelNum")
	WebElement LevelNumber;
	
	@FindBy(id="popup_ok")
	WebElement PopUpOk;
	
	@FindBy(id="popup_cancel")
	WebElement PopUpCancel;
	
	@FindBy(id="Detailview")
	WebElement frames;
	
	@FindBy(id="iframeTree")
	WebElement frames1;
	
	@FindBy(id="txtLevelName")
	WebElement LevelName;
	
	@FindBy(id="txtPrefix")
	WebElement Prefix;
	
	@FindBy(id="txtReviewUnit")
	WebElement Review;
	
	@FindBy(id="drpReviewAfter")
	WebElement dropdownReview;
	
	@FindBy(id="chkSiteMod")
	WebElement SiteModCheckbox;
	
	@FindBy(id="chkAllowSiteSub")
	WebElement SubLevel;
	
	@FindBy(id="btnSave")
	WebElement Save;
	
	@FindBy(id="popup_message")
	WebElement PopUpMsg;
	//---------------------------------Sub Level ------------------------------
	@FindBy(xpath="//a[@title='test level']")
	WebElement Level;
	
	@FindBy(id="anew")
	WebElement NewLevel;
	
	@FindBy(id="tdParentLevelName")
	WebElement ParentLevelName;
	
	@FindBy(xpath="//a[@title='test change']")
	WebElement Level1;
	
	//----------------------------------Edit level------------------------------
	@FindBy(id="aedit")
	WebElement Editlevel;
	
	//--------------------------------Delete level-------------------------------
	@FindBy(id="adelete")
	WebElement DeleteLevel;
	
	@FindBy(xpath="//a[@title='Test level']")
	WebElement Level2;
	
	
	public void LevelNumber(String arg1) throws InterruptedException{
		Thread.sleep(5000);
		driver.switchTo().frame(frames);
		Thread.sleep(5000);
		driver.switchTo().frame(frames1);
		HighlightFailedElements.changeColor("rgb(0,200,0)", LevelNumber, driver);
		HighlightFailedElements.drawBorder(LevelNumber, driver);
		Thread.sleep(4000);
		LevelNumber.click();
		HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
		HighlightFailedElements.drawBorder(PopUpOk, driver);
		Thread.sleep(5000);
		PopUpOk.click();
		Thread.sleep(4000);
		String num = LevelNumber.getAttribute("value");
		System.out.println("Default Level Number:"+num);
		Thread.sleep(3000);
		LevelNumber.clear();
		Thread.sleep(2000);
		LevelNumber.sendKeys(arg1);
		String num1 = LevelNumber.getAttribute("value");
		System.out.println("Changed Level Number:"+num1);
		Thread.sleep(4000);
	}
	
	
	public void LevelName(String arg1){
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", LevelName, driver);
		HighlightFailedElements.drawBorder(LevelName, driver);
		
		LevelName.sendKeys(arg1);
		
		waitdriver.ExpWait(driver, LevelName, 10);
		
	}
	
	public void Prefix(String arg1){
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Prefix, driver);
		HighlightFailedElements.drawBorder(Prefix, driver);
		
		Prefix.sendKeys(arg1);
		
		waitdriver.ExpWait(driver, Prefix, 10);
		
		
	}
	
	public void DocumentReview(String arg1){
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Review, driver);
		HighlightFailedElements.drawBorder(Review, driver);
		
		Review.clear();
		
		Review.sendKeys(arg1);
		
		waitdriver.ExpWait(driver, Review, 10);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", dropdownReview, driver);
		HighlightFailedElements.drawBorder(dropdownReview, driver);
		
		Select day = new Select(dropdownReview);
		day.selectByValue("Day");
		
		waitdriver.ExpWait(driver, dropdownReview, 10);
		
	}
	
	public void SiteModification() throws InterruptedException{
		
		boolean sitemod = SiteModCheckbox.isEnabled();
		System.out.println("Site Modification checkbox is enabled:"+sitemod);
		
		if (sitemod == true){
			
			SiteModCheckbox.click();
			
			Thread.sleep(5000);
			
		}else{
			
			System.out.println("SiteMod Checkbos is Enabled");
			
		}

	}
	
	public void SubLevelCreation() throws InterruptedException{
		
		boolean sub = SubLevel.isSelected();
		
		System.out.println("Sub level checkbox selected:"+ sub);
		
		if(sub == false){
			
			SubLevel.click();
			
			Thread.sleep(5000);
			
		} else{
			
			
			System.out.println("Sub Levels checkbox is Enabled");
			
		}
		
	}
	
	public void savethelevel() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", Save, driver);
		HighlightFailedElements.drawBorder(Save, driver);

		Save.click();
		
		Thread.sleep(4000);
		
		String message = PopUpMsg.getText();
		
		System.out.println("Success Message:"+message);
		
		Assert.assertEquals("Submitted successfully", message);
		
	}
	
	public void GetDefaultNumber() throws InterruptedException{
		
		driver.switchTo().frame(frames);
		Thread.sleep(5000);
		driver.switchTo().frame(frames1);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", LevelNumber, driver);
		HighlightFailedElements.drawBorder(LevelNumber, driver);
		
		String num = LevelNumber.getAttribute("value");
		System.out.println("Default Level Number:"+num);
		
		
	}
	
	public void LevelRightClick() throws InterruptedException {
		driver.switchTo().frame(frames);
		Thread.sleep(5000);
		
		Actions a = new Actions(driver);
		a.contextClick(Level).build().perform();
		
		Thread.sleep(5000);
		
		
		
		
	}
	
	public void newSubLevel() throws InterruptedException {
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", NewLevel, driver);
		HighlightFailedElements.drawBorder(NewLevel, driver);
		
		NewLevel.click();
		
		Thread.sleep(4000);
		
		
	}
	
	public void getParentName() throws InterruptedException {
		driver.switchTo().frame(frames1);
		
		Thread.sleep(6000);
		
		String s = ParentLevelName.getText();
		System.out.println("Name fo the Parent Level::"+s);
		
		Thread.sleep(6000);
		
		
	}
	
public void GetDefaultNumber1() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", LevelNumber, driver);
		HighlightFailedElements.drawBorder(LevelNumber, driver);
		
		String num = LevelNumber.getAttribute("value");
		System.out.println("Default Level Number:"+num);
		
		
	}

//---------------------------------Edit level-----------------------------------------------------------

public void edit() throws InterruptedException {
	
	driver.switchTo().frame(frames);
	Thread.sleep(5000);
	
	Actions a = new Actions(driver);
	a.contextClick(Level).build().perform();
	
	Editlevel.click();
	
	Thread.sleep(5000);
		
}

public void editlevelnumber(String arg1) throws InterruptedException {
	driver.switchTo().frame(frames1);
	Thread.sleep(5000);
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", LevelNumber, driver);
	HighlightFailedElements.drawBorder(LevelNumber, driver);
	Thread.sleep(4000);
	LevelNumber.click();
	HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
	HighlightFailedElements.drawBorder(PopUpOk, driver);
	Thread.sleep(5000);
	PopUpOk.click();
	Thread.sleep(4000);
	String num = LevelNumber.getAttribute("value");
	System.out.println("Default Level Number:"+num);
	Thread.sleep(3000);
	LevelNumber.clear();
	Thread.sleep(2000);
	LevelNumber.sendKeys(arg1);
	String num1 = LevelNumber.getAttribute("value");
	System.out.println("Changed Level Number:"+num1);
	Thread.sleep(4000);
	
}

public void editLevelName(String arg1) throws InterruptedException {

	HighlightFailedElements.changeColor("rgb(0,200,0)", LevelName, driver);
	HighlightFailedElements.drawBorder(LevelName, driver);
	
	LevelName.clear();
	
	Thread.sleep(2000);
	
	LevelName.sendKeys(arg1);
	
	waitdriver.ExpWait(driver, LevelName, 10);
	
	
}

public void EditPrefix(String arg1) throws InterruptedException {
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Prefix, driver);
	HighlightFailedElements.drawBorder(Prefix, driver);
	
	Prefix.clear();
	
	Thread.sleep(2000);
	
	Prefix.sendKeys(arg1);
	
	waitdriver.ExpWait(driver, Prefix, 10);
	

	
}

//----------------------------------------Edit level with Default number----------------------------

public void editDefaultlevel() throws InterruptedException {
	
	driver.switchTo().frame(frames);
	Thread.sleep(5000);
	
	Actions a = new Actions(driver);
	a.contextClick(Level1).build().perform();
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Editlevel, driver);
	HighlightFailedElements.drawBorder(Editlevel, driver);
	
	Editlevel.click();
	
}

public void GetDefaultNumber2() throws InterruptedException{
	
	driver.switchTo().frame(frames1);
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", LevelNumber, driver);
	HighlightFailedElements.drawBorder(LevelNumber, driver);
	
	String num = LevelNumber.getAttribute("value");
	System.out.println("Default Level Number:"+num);
	
	
}

public void editLevelName1(String arg1) throws InterruptedException {
	
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", LevelName, driver);
	HighlightFailedElements.drawBorder(LevelName, driver);
	
	LevelName.clear();
	
	Thread.sleep(2000);
	
	LevelName.sendKeys(arg1);
	
	waitdriver.ExpWait(driver, LevelName, 10);
	
	
}

//------------------------------Delete the level--------------------------------

public void Deltelevel() throws InterruptedException {
	
	driver.switchTo().frame(frames);
	Thread.sleep(5000);
	
	Actions a = new Actions(driver);
	a.contextClick(Level2).build().perform();
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", DeleteLevel, driver);
	HighlightFailedElements.drawBorder(DeleteLevel, driver);
	
	DeleteLevel.click();	
	
	
}

public void DeletePopup() throws InterruptedException
{
	Thread.sleep(5000);
	
	PopUpOk.click();
	
	Thread.sleep(5000);
	
	PopUpOk.click();
	
	
	
}


}
