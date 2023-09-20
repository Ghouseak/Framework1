package com.demo.testcases;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pageObjects.LoginPage;


public class Explorer extends BaseClass {
	
	@Test(priority=1)
	public void createnewfolder() throws Exception {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(100));
		LoginPage lp = new LoginPage(driver);
		lp.QATenant.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Explorer']")));
		lp.ExplorerMenu.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nameInner' and  text()='Testing']/following::img")));
		lp.TestingMenu_ThreedottedIcon.click();
		Thread.sleep(5000);
		Actions a= new Actions(driver);
		a.moveToElement(lp.NewIcon).perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='context_menu_btn' and contains(text(),'New Folder')]")));
		lp.NewFolder.click();
		Thread.sleep(5000);
		lp.NewFolder_textbox.sendKeys(foldername);
		Thread.sleep(3000);
		try {
		lp.ErrorMessage_Folder.isDisplayed();
			System.out.println("Entering another name");
			lp.NewFolder_textbox.sendKeys("testq");
		}
		catch(Exception e) {
			System.out.println("proceeding to cretae a new folder");	
		}
		lp.Createbtn.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='nameInner' and  text()='"+foldername+"']")));
		Assert.assertTrue(lp.CreatedNewfolder(foldername).isDisplayed(), "created folder not displayed");	
		

	}
	
}