package com.smartclaims.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.smartclaim.utilities.XLUtils;
import com.smartclaims.pageObjects.EditClaimFacts;
import com.smartclaims.pageObjects.LoginPage;
import com.smartclaims.pageObjects.NewClaim;

public class TC_NewClaim_LiaDecisionOutstanding extends BaseClass {


	@Test(priority=1)
	public void loginDDT() throws InterruptedException
	{
		logger=extent.createTest("User Login");
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

	@Test(priority=2,dataProvider="ClaimDetails")
	public void newClaim_moreInfo(String claimdate, String appid,String defname, String Cname,String csname,String refno) throws InterruptedException
	{
		logger=extent.createTest("Creating a new claim for getting More Information required Output");
		NewClaim Nc = new NewClaim(driver);
		EditClaimFacts ec = new EditClaimFacts(driver);
		Thread.sleep(2000);
		Nc.clickAddClaim();
		Thread.sleep(2000);
		//Adding claim details
		Nc.setClaimDate(claimdate);
		Thread.sleep(2000);
		Nc.setAppId(appid);
		Thread.sleep(2000);
		Nc.setDefendantName(defname);
		Thread.sleep(2000);
		Nc.setClaimantName(Cname);
		Thread.sleep(2000);
		Nc.setClaimantSolicitor(csname);
		Thread.sleep(2000);
		Nc.setReferenceNumber(refno);
		Thread.sleep(2000);
		logger.log(Status.INFO, "Adding new claim");
		//Save the claim
		Nc.saveClaim();
		Thread.sleep(3000);
		logger.log(Status.PASS, "Saved claim successfully");

		//Filling the claim details to get more information output

		//Q1
		logger.log(Status.INFO, "Adding claim details");
		ec.WizardNextBtn();
		Thread.sleep(6000);
		//Q2
		Nc.AwareofSlipTrip_YesOption();
		Thread.sleep(6000);
		//Q3
		Nc.SlipTripHappen_YesOption();
		Thread.sleep(3000);
		//Q4
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q5
		Nc.WorkingDuringTimeofInc_YesOption();
		Thread.sleep(3000);
		//Q6
		Nc.TaskAllottedwhileIncHappened_YesOption();
		Thread.sleep(3000);
		//Q7
		Nc.ClmntMentnVulnerabilities_UKOption();
		Thread.sleep(3000);
		//Q8
		Nc.ClmntContinuedWorking_YesOption();
		Thread.sleep(3000);
		//Q9
		Nc.BusinessOwnControl_YesOption();
		Thread.sleep(3000);
		//Q10
		Nc.IncOccuredOnPremise_YesOption();
		Thread.sleep(3000);
		//Q11
		Nc.Thirdpartyrunning_NoOption();
		Thread.sleep(3000);
		//Q12
		Nc.ClaimantPAYE_YesOption();
		Thread.sleep(3000);
		//Q13
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q14
		Nc.AnythingOnFloor_UKOption();
		Thread.sleep(3000);
		//Q15
		Nc.SufficientLighting_UKOption();
		Thread.sleep(3000);
		//Q16
		Nc.HandRailSimilar_UKOption();	
		Thread.sleep(3000);
		//Q17
		Nc.SafetyNoticeHazard_UKOption();
		Thread.sleep(3000);
		//Q18
		Nc.RiskAssessHealth_UKOption();
		Thread.sleep(3000);
		//Q19
		Nc.RegularChecks_IncLocation();
		Thread.sleep(3000);
		//Q20
		Nc.BusinessResp_CleanTidy();
		Thread.sleep(3000);
		//Q21
		Nc.ProtectiveEquipment();
		Thread.sleep(3000);
		//Q22
		Nc.TrainingSupervision();
		Thread.sleep(3000);
		//Q23
		Nc.ChangeInProcedures();
		Thread.sleep(3000);
		//Q24
		Nc.SimilarIncBefore();
		Thread.sleep(3000);
		//Q25
		Nc.AnybodySeeInc();
		Thread.sleep(3000);
		//Q26
		Nc.ContributeownInjury();
		Thread.sleep(3000);
		//Q27
		Nc.CorrectTrainingProcedure();
		Thread.sleep(3000);
		//Q28
		ec.WizardNextBtn();
		Thread.sleep(3000);
		//Q29
		Nc.MedicalAttention();
		Thread.sleep(3000);
		//Q30
		Nc.HowSeriousInjury();
		Thread.sleep(3000);
		//Q31
		Nc.FileUploadPolicyWord();
		Thread.sleep(3000);
		ec.WizardNextBtn();
		Thread.sleep(5000);
		//Q32
		Nc.FileUploadPolicyScedule();
		Thread.sleep(5000);
		ec.WizardNextBtn();
		Thread.sleep(3000); 
		//Saving the workflow
		ec.WizardSaveBtn();
		Thread.sleep(7000);

		if(driver.getPageSource().contains("Liability decision outstanding"))
		{
			logger.log(Status.PASS, "Got Liability decision outstanding output");
		}

		else
		{
			logger.log(Status.FAIL, "Output not correct");
		}

		//Returning to dashboard
		Nc.Back2Dash();
		Thread.sleep(3000);

	}

	@DataProvider(name="ClaimDetails")
	String [][] getData() throws IOException
	{
		//Obtaining the path of excel file
		String path = System.getProperty("user.dir")+"/src/test/java/com/smartclaims/testData/ClaimDetails.xlsx";

		//Getting row and coloumn count from the excel file
		int rownum = XLUtils.getRowCount(path, "NewClaim_LiaOutstanding");
		int cocount= XLUtils.getCellCount(path, "NewClaim_LiaOutstanding", 1);

		//Creating an array to store values
		String loginData[][] = new String[rownum][cocount];

		for(int i=1;i<=rownum;i++) //Number of rows
		{
			for(int j=0;j<cocount;j++) //Number of columns
			{
				// loginData[i-1][j] means [0][0] position in array and we are putting i,j values starting from 1st row and 0th cell of excel sheet
				//All the files in the excel file will be copied to array after the for loop completes
				loginData[i-1][j] = XLUtils.getCellData(path, "NewClaim_LiaOutstanding", i, j);
			}

		}

		return loginData;
	}
} 