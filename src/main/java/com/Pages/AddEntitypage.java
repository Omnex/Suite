package com.Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Base.Base;
import com.Utilities.HighlightFailedElements;
import com.Utilities.waitdriver;


public class AddEntitypage extends Base {

	public waitdriver wait;
	
	public AddEntitypage() throws Exception {
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="tblEntityName")
	WebElement EntityName;
	
	@FindBy(id="txtShortName")
	WebElement ShortName;
	
	@FindBy(id="txtEntitytype_chzn")
	WebElement EntityType;
	
	@FindBy(id="txtBusinessunit_chzn")
	WebElement BusinessUnit;
	
	@FindBy(id="txtSitefun_chzn")
	WebElement SiteFunction;
	
	@FindBy(id="txtEntitytype_chzn_o_1")
	WebElement EntityDropdown;
	
	@FindBy(id="txtBusinessunit_chzn_o_1")
	WebElement BusinessUnitDropDown;
	
	@FindBy(id="txtSitefun_chzn_o_0")
	WebElement SiteFunctionDropDown;
	
	@FindBy(id="ddStatus")
	WebElement SiteDropdown;
	
	@FindBy(id="ddIsSite")
	WebElement IsSiteDropdown;
	
	@FindBy(id="txtAddressNew")
	WebElement Address;
	
	@FindBy(id="txtContactNoNew")
	WebElement Contacts;
	
	@FindBy(id="txtFaxNoNew")
	WebElement Fax;
	
	@FindBy(id="Img1")
	WebElement Country;
	
	@FindBy(id="CountryDropdown_chzn_o_99")
	WebElement CountryDropdown;
	
	@FindBy(id="CountryDropdown_chzn")
	WebElement CountrySearch;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement CountrySearch1;
	
	@FindBy(id="StateDropdown_chzn")
	WebElement StateDropdown;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement StateSearch;
	
	@FindBy(id="CityDropdown_chzn")
	WebElement CityDropdown;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement CitySearch;

	@FindBy(id="btnDoneLocation")
	WebElement DoneBtn;
	
	@FindBy(xpath="//input[@id='txtBrachNoNew']")
	WebElement Branch;
	
	@FindBy(id="ddselCurrencyNew")
	WebElement CurrencyDropDown;
	
	@FindBy(id="ddlRoute")
	WebElement RouteDropdown;
	
	@FindBy(id="Detailview")
	WebElement frames;
	
	@FindBy(id="lblAddContactPer")
	WebElement AddContact;
	
	@FindBy(id="jqg_userListingGridControl_1")
	WebElement Checkbox;
	
	@FindBy(id="gs_Fullname")
	WebElement SearchUserUsingName;
	
	@FindBy(xpath="//input[@value='Done']")
	WebElement Done;
	
	@FindBy(id="ifrUsers")
	WebElement frames1;
	
	@FindBy(id="radio_97")
	WebElement CheckBoxPrimaryContact;
	
	@FindBy(xpath="//input[@value='Save']")
	WebElement SaveBtn;
	
	@FindBy(id="popup_ok")
	WebElement PopUpOk;
	
	//Enter Entity Name
	public void EntityName(String arg1) throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", EntityName, driver);
		HighlightFailedElements.drawBorder(EntityName, driver);
		EntityName.sendKeys(arg1);
		
		Thread.sleep(5000);
		
		
	}
	
	//Enter Entity Short Name
	public void EntityShortName(String arg1) throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", ShortName, driver);
		HighlightFailedElements.drawBorder(ShortName, driver);
		
		ShortName.sendKeys(arg1);

		Thread.sleep(5000);
	}
	
	//Select Entity Type from the Dropdown
	public void EntityTypeDropdown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", EntityType, driver);
		HighlightFailedElements.drawBorder(EntityType, driver);
		
		EntityType.click();
		
		Thread.sleep(5000);
		
		EntityDropdown.click();
		
		Thread.sleep(5000);
		
		
	}
	
	//Select Business unit from the Dropdown
	public void BusinessUnitDropdown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", BusinessUnit, driver);
		HighlightFailedElements.drawBorder(BusinessUnit, driver);
		
		BusinessUnit.click();
		
		Thread.sleep(5000);
		
		BusinessUnitDropDown.click();
		
		Thread.sleep(5000);
	}
	
	//Select Site Function Dropdown
	public void SiteFunctionDropDown() throws InterruptedException{
		
		Thread.sleep(5000);
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SiteFunction, driver);
		HighlightFailedElements.drawBorder(SiteFunction, driver);
		
		SiteFunction.click();
		
		Thread.sleep(5000);
		
		SiteFunctionDropDown.click();
		
		Thread.sleep(5000);
		
		
	}
	
	public void SiteDropDown() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", SiteDropdown, driver);
		HighlightFailedElements.drawBorder(SiteDropdown, driver);
		
		Select site = new Select(SiteDropdown);
		site.selectByValue("1");
		
		Thread.sleep(5000);
	}
	
public void IsSiteDropDown() throws InterruptedException{
		
		HighlightFailedElements.changeColor("rgb(0,200,0)", IsSiteDropdown, driver);
		HighlightFailedElements.drawBorder(IsSiteDropdown, driver);
		
		Select Issite = new Select(IsSiteDropdown);
		Issite.selectByValue("1");
		
		Thread.sleep(5000);
	}

public void Address() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Address, driver);
	HighlightFailedElements.drawBorder(Address, driver);
	
	Address.sendKeys("Entity home");
	
	Thread.sleep(4000);
	
	
}

public void Contacts() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Contacts, driver);
	HighlightFailedElements.drawBorder(Contacts, driver);
	
	Contacts.sendKeys("12345678");
	
	Thread.sleep(4000);
	
}

public void Fax(String arg1) throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Fax, driver);
	HighlightFailedElements.drawBorder(Fax, driver);
	
	Fax.sendKeys(arg1);
	Thread.sleep(4000);
	
}

public void Country() throws InterruptedException{
	
	Country.click();
	
	Thread.sleep(4000);
	
	Set<String> countries = driver.getWindowHandles();
	
	System.out.println(countries.size());
	
	Iterator<String> i1 = countries.iterator();
	
	String parent = i1.next();
	
	String child = i1.next();
	
	driver.switchTo().window(child);
	
	String s = driver.getTitle();
	
	System.out.println(s);
	
	driver.manage().window().maximize();
	
	Thread.sleep(7000);
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", CountrySearch, driver);
	HighlightFailedElements.drawBorder(CountrySearch, driver);
	
	Thread.sleep(3000);
	
	CountrySearch.click();
	
	Thread.sleep(3000);
	
	CountrySearch1.sendKeys("India");
	
	Thread.sleep(5000);
	
	CountryDropdown.click();
	
	Thread.sleep(4000);

	DoneBtn.click();
	
	Thread.sleep(4000);
	
	driver.switchTo().window(parent);
	
	String s2 =driver.getTitle();
	
	System.out.println(s2);
	
	Thread.sleep(6000);
	
	
	
	
	
}

public void Branchnumber(String arg1) throws InterruptedException{
	
	driver.switchTo().frame(frames);
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", Branch, driver);
	HighlightFailedElements.drawBorder(Branch, driver);
	
	Branch.sendKeys(arg1);
	
	Thread.sleep(4000);
	
}

public void Currency() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", CurrencyDropDown, driver);
	HighlightFailedElements.drawBorder(CurrencyDropDown, driver);
	
	Select cur = new Select(CurrencyDropDown);
	
	cur.selectByValue("7");
	
	Thread.sleep(4000);
	
}

public void Route() throws InterruptedException{
	HighlightFailedElements.changeColor("rgb(0,200,0)", RouteDropdown, driver);
	HighlightFailedElements.drawBorder(RouteDropdown, driver);
	
	Select route = new Select(RouteDropdown);
	
	route.selectByValue("8");
	
	Thread.sleep(4000);
	
}

public void addContactPerson() throws InterruptedException{
	
	AddContact.click();
	
	Thread.sleep(6000);
	
	WebElement target = driver.switchTo().activeElement();
	waitdriver.ExpWait(driver,target , 20);
	
	driver.switchTo().frame(frames1);
	
	SearchUserUsingName.sendKeys("abi");
	
	SearchUserUsingName.sendKeys(Keys.ENTER);
	
	Checkbox.click();
	
	Thread.sleep(4000);
	
	Done.click();
	
	driver.switchTo().defaultContent();
	
	Thread.sleep(6000);
	
	
	
}

public void PrimaryContact() throws InterruptedException{
	
	driver.switchTo().frame(frames);
	
	CheckBoxPrimaryContact.click();
	
	Thread.sleep(5000);
	
	
	
}

public void SaveBtn() throws InterruptedException{
	
	SaveBtn.click();
	
	Thread.sleep(5000);
	
}

public void IsSiteInActive() throws InterruptedException{
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", SiteDropdown, driver);
	HighlightFailedElements.drawBorder(SiteDropdown, driver);
	
	Select site = new Select(SiteDropdown);
	site.selectByValue("2");
	
	Thread.sleep(5000);
	
}


public void getErrorMessage() throws Exception{
	
	WebElement b =driver.findElement(By.id("popup_message"));
	
	String s = b.getText();
	
	System.out.println(s);
	
	
	HighlightFailedElements.changeColor("rgb(0,200,0)", PopUpOk, driver);
	HighlightFailedElements.drawBorder(PopUpOk, driver);
	
	PopUpOk.click();
	
	Thread.sleep(5000);
	
	
	
	
}





	
}
