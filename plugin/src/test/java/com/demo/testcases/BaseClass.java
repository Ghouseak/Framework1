package com.demo.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.demo.utilities.Readconfig;

public class BaseClass {
	Readconfig readconfig = new Readconfig();
	

	public String baseURL= readconfig.getApplicationURL();
	public String foldername= readconfig.getfoldername();
	public String deletefoldername= readconfig.getdeletefoldername();
	public String processname= readconfig.getprocessname();
	public String childname= readconfig.getchildtodimensionname();
	public String siblingname= readconfig.getsiblingtodimensionname();
	public String copymember= readconfig.getcopyname();
	public String cutmember= readconfig.getcutname();
	public String movedimension= readconfig.getmoveupdowndimesionname();
	public String copyaschildanothermember= readconfig.getcopychildtoanothermembername();
	public String draganddrop1= readconfig.getdraganddrop1();
	public String draganddrop2= readconfig.getdraganddrop2();
	public String moveupdownrelative= readconfig.getmoveupdownrelative();
	public String moveup1= readconfig.getmoveup1();
	public String moverelative= readconfig.getmoverelative();
	public String Hierarchy= readconfig.getHierarchy();
	public String draganddrophierarchy= readconfig.getdraganddrophierarchy();
	public String Aschildanothermember= readconfig.getAschildanothermember();
	public static WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String br) throws Exception {
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getchomepath());
		driver = new ChromeDriver();
		}
		else if(br.equals("firefox")){
			System.setProperty("webdriver.chrome.driver",readconfig.getchomepath());
			driver = new FirefoxDriver();
		}
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		
		System.out.println("Test method executed");
//		Thread.sleep(15000);
//		WebElement username =driver.findElement(By.id("i0116"));
//		username.sendKeys("QAAutomation@fluence.app");
//		Thread.sleep(4000);
//		WebElement next_btn =driver.findElement(By.id("idSIButton9"));
//		next_btn.click();
//		Thread.sleep(4000);
//		WebElement password =driver.findElement(By.xpath("//input[@name='passwd']"));
//		password.sendKeys("Toronto2023");
//		Thread.sleep(4000);
//		WebElement submit_btn =driver.findElement(By.id("idSIButton9"));
//		submit_btn.click();
//		Thread.sleep(4000);
//		WebElement yes_btn =driver.findElement(By.id("idSIButton9"));
//		yes_btn.click();
//		Thread.sleep(12000);
			
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
