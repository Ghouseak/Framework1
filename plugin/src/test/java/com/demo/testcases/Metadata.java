package com.demo.testcases;

import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.demo.pageObjects.LoginPage;

public class Metadata extends BaseClass {
	
	@Test(priority=1)
	public void CreateDimesion1() throws Exception {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(100));
		LoginPage lp = new LoginPage(driver);
		lp.QATenant.click();
		Thread.sleep(50000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Models']")));
		lp.ModelMenu.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Dimensions']")));
		lp.Dimension.click();
		driver.navigate().refresh();
		Thread.sleep(30000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add ']")));
		lp.AddDimension.click(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Dimension Name']")));
		lp.Dimensionname.sendKeys("Newdimen");
		Select obj = new Select(driver.findElement(By.xpath("//select[@id='Type']")));
		obj.selectByVisibleText("Account");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Max Depth']")));
		lp.Maxdepth.clear();
		lp.Maxdepth.sendKeys("5");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/add.c63b6422.svg' and @class='accent-svg icon']")));
		lp.Addproperty.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='newPropertyName']")));
		lp.Newpropertyname.clear();
		lp.Newpropertyname.sendKeys("text");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/save.78f570fc.svg' and @class='icon theme-svg']")));
		lp.NewpropertySave.click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='SAVE']")));
		lp.DimensionSave.click(); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Dimension saved successfully')]")));
		Assert.assertTrue(lp.DimensionSave_successmessage.isDisplayed(), "Dimension not saved");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='/img/process_metadata_changes.4d387729.svg' and @class='accent-svg']")));
		driver.findElement(By.xpath("//img[@src='/img/process_metadata_changes.4d387729.svg' and @class='accent-svg']")).click();
		Thread.sleep(10000);
		
}
	
	
}


//