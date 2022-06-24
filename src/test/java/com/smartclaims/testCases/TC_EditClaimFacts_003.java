package com.smartclaims.testCases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.smartclaims.pageObjects.EditClaimFacts;
import com.smartclaims.pageObjects.LoginPage;

public class TC_EditClaimFacts_003 extends BaseClass {

	@Test (priority=1)
	public void kcg()
	{
		logger=extent.createTest("TC_001: Verifying whether Kcg login page loaded");
		logger.log(Status.INFO, "Trying to open Kcg login page for Smartclaim portal");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Username")));
		//Verifying if Kcglogin page loaded successfully
		if (driver.getTitle().equalsIgnoreCase("Kcg"))
		{
			logger.log(Status.PASS, "Kcg login page opened succesfully");
		}
		else
		{
			logger.log(Status.FAIL, "Some issue with loading Kcg");
		}
	}

	@Test(priority=2)
	public void loginDDT() throws InterruptedException
	{
		logger=extent.createTest("TC_002: User Login");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName("Staging.User1@SMARTC.com");
		lp.setPassword("Test123456!");
		lp.clickSubmit();

		if(driver.getTitle().equals("SmartClaim"))

		{
			Assert.assertTrue(true);
			logger.log(Status.PASS, "Logged in succesfully");
		}
		else
		{
			Assert.assertTrue(false);
			logger.log(Status.FAIL, "Some issue with loging in");
		}	
	}

	@Test(priority=3)
	public void searchClaimCard() throws InterruptedException
	{
		logger=extent.createTest("TC_003: Searching for a claim");
		EditClaimFacts ec = new EditClaimFacts(driver);
		Thread.sleep(2000);
		//Inputing search value(Incident)
		ec.searchfield(searchkey);
		//Clicking search button
		ec.clickSearchSubmit();
		Thread.sleep(2000);		
		logger.log(Status.PASS, "Search claim working properly");
	}

	@Test(priority=4)
	public void SelectClaimCard() throws InterruptedException
	{
		logger=extent.createTest("TC_004: Selecting Edit claim facts");
		//Selecting card settings button
		EditClaimFacts ec = new EditClaimFacts(driver);
		logger.log(Status.INFO, "Selecting card settings button");
		ec.clickCardSettings();
		Thread.sleep(2000);
		//Selecting Edit claim facts
		logger.log(Status.INFO, "Selecting Edit Claim Facts");

		WebElement setlist= driver.findElement(By.tagName("li"));
		List<WebElement> settingsentries=setlist.findElements(By.tagName("li"));
		for (WebElement li : settingsentries) {
			if (li.getText().equals("Edit Claim facts")) {
				li.click();
			}
		}
		logger.log(Status.PASS, "Selected the claim for editing");
		Thread.sleep(3000);

	}
	@Test(priority=5)
	public void EditClaim() throws InterruptedException
	{
		logger=extent.createTest("TC_005: Navigating and editing claim facts");
		//Selecting card settings button
		EditClaimFacts ec = new EditClaimFacts(driver);
		//Q2
		logger.log(Status.INFO, "Selecting Wizard next buttons");
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q3
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q4
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q5
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q6
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q7		
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q8
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q9
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q10
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q11
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q12				
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q13
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q14
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q15
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q16
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q17				
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q18
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q19
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q20
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q21
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q22
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q23
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q24
		ec.WizardNextBtn();
		Thread.sleep(3000);
		
		logger.log(Status.INFO, "Saving the web component questions");
		
		//Saving the web component questions
		ec.WizardSaveBtn();
		Thread.sleep(5000);
		logger.log(Status.PASS, "Saved web component questions succesfully");
	}
}
