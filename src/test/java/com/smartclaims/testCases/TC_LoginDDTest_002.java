package com.smartclaims.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.LoginPage;

public class TC_LoginDDTest_002 extends BaseClass
{

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

	@Test(priority=2,dataProvider="LoginDetails")
	public void loginDDT(String user,String pwd) throws InterruptedException
	{


		logger=extent.createTest("TC_002: User Login");
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		lp.setPassword(pwd);
		lp.clickSubmit();
		//	try {
		//	Thread.sleep(3000);
		//		} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		//e.printStackTrace();
		//	}
		//Verifying whether logged in successfully 
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


		driver.findElement(By.xpath ("//*[@id=\"rightNavSection\"]/k-header-right-section/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath ("//*[@id=\"pop-user-options\"]/div/div/div/div[2]")).click();

	}

	@DataProvider(name="LoginDetails")
	String [][] getData() throws IOException
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/LoginDetails.xlsx";

		//Getting row and coloumn count from the excel file
		int rownum = XLUtils.getRowCount(path, "sheet1");
		int cocount= XLUtils.getCellCount(path, "sheet1", 1);

		//Creating an array to store values
		String loginData[][] = new String[rownum][cocount];

		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				loginData[i-1][j] = XLUtils.getCellData(path, "sheet1", i, j);
			}

		}

		return loginData;
	}




}
