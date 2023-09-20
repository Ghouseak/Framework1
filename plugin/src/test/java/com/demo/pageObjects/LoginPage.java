package com.demo.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver){
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Consolidation QA Automation']")
	public WebElement QATenant;
	
	@FindBy(xpath="//div[@class='expander collapsed']")
	public WebElement ExpandMenu;
	
	@FindBy(xpath="//span[@class='nameInner' and  text()='Testing']")
	public WebElement TestingMenu;
	
	@FindBy(xpath="//span[@class='nameInner' and  text()='Testing']/../parent::div/child::div")
	public WebElement TestingMenu_expandicon;
	
	@FindBy(xpath="//span[@class='nameInner' and  text()='Testing']/following::img")
	public WebElement TestingMenu_ThreedottedIcon;
	
	@FindBy(xpath="//div[@class='context_menu_btn' and contains(text(),'New')]")
	public WebElement NewIcon;
	
	@FindBy(xpath="//div[@class='context_menu_btn' and contains(text(),'Delete')]")
	public WebElement DeleteMenu;
	
	@FindBy(xpath="//div[@class='context_menu_btn' and contains(text(),'New Folder')]")
	public WebElement NewFolder;
	
	@FindBy(xpath="//div[@class='context_menu_btn' and contains(text(),'New Process')]")
	public WebElement NewProcess;
	
	
	@FindBy(xpath="//div[@class='context_menu_btn' and contains(text(),'Rename')]")
	public WebElement Rename_option;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement NewFolder_textbox;
	
	@FindBy(xpath="//img[@class='theme-svg']")
	public WebElement Savebtn_process;

	@FindBy(xpath="//div[text()='Explorer']")
	public WebElement ExplorerMenu;
	
	@FindBy(xpath="//div[text()='Models']")
	public WebElement ModelMenu;
	@FindBy(xpath="//a[@title='Dimensions']")
	public WebElement Dimension;
	@FindBy(xpath="//div[text()='Add ']")
	public WebElement AddDimension;
	@FindBy(xpath="//input[@placeholder='Dimension Name']")
	public WebElement Dimensionname;
	@FindBy(xpath="//input[@placeholder='Max Depth']")
	public WebElement Maxdepth;
	@FindBy(xpath="//img[@src='/img/add.c63b6422.svg' and @class='accent-svg icon']")
	public WebElement Addproperty;
	@FindBy(xpath="//input[@id='newPropertyName']")
	public WebElement Newpropertyname;
	@FindBy(xpath="//img[@src='/img/save.78f570fc.svg' and @class='icon theme-svg']")
	public WebElement NewpropertySave;
	@FindBy(xpath="//div[text()='SAVE']")
	public WebElement DimensionSave;
	@FindBy(xpath="//div[contains(text(),'Dimension saved successfully')]")
	public WebElement DimensionSave_successmessage;
	
	@FindBy(xpath="//div[text()='Dimension could not be saved: Dimension already exists.']")
	public WebElement DimensionDuplicate_Errormessage;
	@FindBy(xpath="//div[text()='CREATE']")
	public WebElement Createbtn;
	
	@FindBy(xpath="//div[contains(text(),'Sorry, there is already an object in the directory with that name. Please provide a different name.')]")
	public WebElement ErrorMessage_Folder;
	
	@FindBy(xpath="//div[text()=' DELETE ']")
	public WebElement Deletebtn;
	
	@FindBy(xpath="//div[text()='RENAME']")
	public WebElement Rename_button;
	
	@FindBy(xpath="(//span[@class='nameInner' and  text()='Testing'])[2]/following::img[contains(@src,'/img/star')]")
	public WebElement StarIcon;
	
	@FindBy(xpath="//span[text()='Favorites']")
	public WebElement Favoritestab;
	
	@FindBy(xpath="//*[contains(text(),'Item added to Favorites')]")
	public WebElement ItemAdded_favorites;
	
	@FindBy(xpath="//*[contains(text(),'Item removed from Favorites')]")
	public WebElement ItemRemoved_Favorites;
	
	@FindBy(xpath="//span[text()='Direct Revenue']")
	public WebElement DirectRevenue;
	
	public WebElement CreatedNewfolder(String text) {
		return ldriver.findElement(By.xpath("//span[@class='nameInner' and  text()='"+text+"']"));		
	}
	
}
