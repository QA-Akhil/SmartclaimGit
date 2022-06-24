package com.smartclaims.pageObjects;

import java.util.List;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewClaim {

	WebDriver ldriver;

	//Creating a constructor for new claim page


	public NewClaim(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);		
	}

	//Locating new claim button
	@FindBy(xpath="/html/body/app-root/div[2]/div/div/div/app-dashboard/div[2]/div/div[1]/form/div/div[2]/div/button")
	WebElement NewClaimBtn;

	//Locating Date of claim
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[1]/div/mat-form-field/div/div[1]/div[1]/input")
	WebElement DateofClaim;

	//Locating Application ID
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[2]/div/input")
	WebElement AppID;

	//Locating defendant Name
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[3]/div/input")
	WebElement DefendantName;

	//Locating claimant Name
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[4]/div/input")
	WebElement ClaimantName;

	//Locating claimant Solicitor
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[5]/div/input")
	WebElement ClaimantSol;

	//Locating Reference Number
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[2]/form/div[6]/div/input")
	WebElement RefNo;

	//Locating Save claim button
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/div/div[3]/div/k-button[2]/button")
	WebElement SaveClaim;

	//Claim Details

	//-------------------------------------------Liability Outstanding----------------------------------------------//

	//Locating "Yes" options

	@FindBy(xpath="//*[@id=\"4536\"]")
	WebElement awareof_sliptrip_yes;

	@FindBy(xpath="//*[@id=\"4538\"]")
	WebElement sliptrip_happen_yes;

	@FindBy(xpath="//*[@id=\"4596\"]")
	WebElement workduringtimeofInc_yes;

	@FindBy(xpath="//*[@id=\"5844\"]")
	WebElement taskallottedwhileInchapn_yes;

	@FindBy(xpath="//*[@id=\"5848\"]")
	WebElement clmntcontinuedworking_yes;

	@FindBy(xpath="//*[@id=\"4466\"]")
	WebElement businessowncontrol_yes;

	@FindBy(xpath="//*[@id=\"4468\"]")
	WebElement incOccurrOnpremise_yes;

	@FindBy(xpath="//*[@id=\"4549\"]")
	WebElement claimantPAYE_Yes;
	
	
	//Locating Unknown options

	@FindBy(xpath="//*[@id=\"5928\"]")
	WebElement clmntMentnVulnrblts;

	@FindBy(xpath="//*[@id=\"5873\"]")
	WebElement anythingonfloor;

	@FindBy(xpath="//*[@id=\"5879\"]")
	WebElement sufficientlighting;

	@FindBy(xpath="//*[@id=\"5881\"]")
	WebElement handrailSimilar;

	@FindBy(xpath="//*[@id=\"5883\"]")
	WebElement safetyNoticeHazard;

	@FindBy(xpath="//*[@id=\"5885\"]")
	WebElement riskAssessHealth;

	@FindBy(xpath="//*[@id=\"5907\"]")
	WebElement regularchecks;

	@FindBy(xpath="//*[@id=\"5892\"]")
	WebElement BusrespClnTdy;

	@FindBy(xpath="//*[@id=\"5853\"]")
	WebElement protectiveEquip;

	@FindBy(xpath="//*[@id=\"5925\"]")
	WebElement trainingSupervsn;

	@FindBy(xpath="//*[@id=\"5901\"]")
	WebElement changeinProcedures;

	@FindBy(xpath="//*[@id=\"5902\"]")
	WebElement similarIncBefore;

	@FindBy(xpath="//*[@id=\"5903\"]")
	WebElement anybodySeeInc;

	@FindBy(xpath="//*[@id=\"5904\"]")
	WebElement contributeOwnInjury;

	@FindBy(xpath="//*[@id=\"5905\"]")
	WebElement correctTrainingProcedure;

	@FindBy(xpath="//*[@id=\"5833\"]")
	WebElement medicalAttention;

	@FindBy(xpath="//*[@id=\"5906\"]")
	WebElement howSeriousInjury;

	//Locating No option

	@FindBy(xpath="//*[@id=\"5822\"]")
	WebElement thirdpartyrunninloc_No;

	//Liability Indicator
	@FindBy(xpath="/html/body/app-root/div[2]/div/div/div/app-summary-view/div[2]/div[1]/div[2]/div/div/div/div[2]/div/div/div[1]/div")
	WebElement LiabilityIndicator;

	//Back to dashboard
	@FindBy(id="logoHeader")
	WebElement Back2Dshbrd;

	//File Upload
	
	@FindBy(id="fup")
	List <WebElement> Fileupload;;

	//-----------------------------------Liability Admitted No suspect-----------------------------------//


	//Yes Options
	@FindBy(xpath="//*[@id=\"4477\"]")
	WebElement AnythingOnfloor_Yes;

	@FindBy(xpath="//*[@id=\"4484\"]")
	WebElement PoorDrainage_Yes;
	
	@FindBy(xpath="//*[@id=\"4557\"]")
	WebElement HazardCausedSlipTrip_Yes;
	
	@FindBy(xpath="//*[@id=\"4482\"]")
	WebElement KnowHazardBefore_Yes;
	
	@FindBy(xpath="//*[@id=\"4547\"]")
	WebElement Resposible4cleanTidy_Yes;
	
	@FindBy(xpath="//*[@id=\"5851\"]")
	WebElement ProtectiveEquipment_Yes;
	
	@FindBy(xpath="//*[@id=\"5922\"]")
	WebElement ProEqupMitigateRisk_Yes;
	
	@FindBy(xpath="//*[@id=\"5854\"]")
	WebElement TrainingSupervision_Yes;
	
	@FindBy(xpath="//*[@id=\"4518\"]")
	WebElement ChangeInProcedures_Yes;
	
	@FindBy(xpath="//*[@id=\"4520\"]")
	WebElement SimilarIncBefore_Yes;
	
	@FindBy(xpath="//*[@id=\"4522\"]")
	WebElement AnybodySeeIncident_Yes;

	@FindBy(xpath="//*[@id=\"4591\"]")
	WebElement FollowTrainingProcedure_Yes;
	
	@FindBy(xpath="//*[@id=\"5829\"]")
	WebElement IncidentReportedtoYou_Yes;


	//No Options

	@FindBy(xpath="//*[@id=\"5847\"]")
	WebElement clmntMentnVulnrblts_No;

	@FindBy(xpath="//*[@id=\"5849\"]")
	WebElement clmntcontinuedworking_No;

	@FindBy(xpath="//*[@id=\"4560\"]")
	WebElement SufcntMatting_No;

	@FindBy(xpath="//*[@id=\"4495\"]")
	WebElement SufcntLighting_No;
	
	@FindBy(xpath="//*[@id=\"4563\"]")
	WebElement Handrail_No;
	
	@FindBy(xpath="//*[@id=\"4473\"]")
	WebElement SafetyNotice_No;
	
	@FindBy(xpath="//*[@id=\"4497\"]")
	WebElement SafetyPolicy_No;
	
	@FindBy(xpath="//*[@id=\"4573\"]")
	WebElement RegularChecks_No;
	
	@FindBy(xpath="//*[@id=\"4509\"]")
	WebElement Regularlycleaned_No;
	
	@FindBy(xpath="//*[@id=\"5857\"]")
	WebElement RecordOfTraining_No;
	
	@FindBy(xpath="//*[@id=\"5859\"]")
	WebElement Witness_No;
	
	@FindBy(xpath="//*[@id=\"4525\"]")
	WebElement ImmediateAction_No;
	
	@FindBy(xpath="//*[@id=\"4527\"]")
	WebElement WitnessProvidestmnt_No;
	
	@FindBy(xpath="//*[@id=\"4532\"]")
	WebElement ContributeOwnInjury_No;
	
	@FindBy(xpath="//*[@id=\"4594\"]")
	WebElement VisibleInjury_No;
	
	@FindBy(xpath="//*[@id=\"5832\"]")
	WebElement MedicalAttention_No;
	
	
	//Hazard fluid option

	@FindBy(xpath="//*[@id=\"4555\"]")
	WebElement Hazard_Fluid;

	//Hazard Employee option

	@FindBy(xpath="//*[@id=\"6144\"]")
	WebElement Hazard_Employee;
	
	//How Serious was Injury GP option
	
	@FindBy(xpath="//*[@id=\"5836\"]")
	WebElement WentToSeeGP;
	
	//Confirm loading and appearance of Liability analysis screen
	
	@FindBy(xpath="//*[@id=\"analysis_rotate_needle\"]/circle")
	WebElement LiabilityIndicatorappeared_Yes;
	


	//--------------------------------------------------Action methods----------------------------------------//

	public void clickAddClaim()
	{
		new WebDriverWait(ldriver, 40).until(ExpectedConditions.elementToBeClickable(NewClaimBtn));
		NewClaimBtn.click();
	}

	public void setClaimDate(String claimdate)
	{

		DateofClaim.sendKeys(claimdate);
	}
	public void setAppId(String appid)
	{

		AppID.sendKeys(appid);
	}
	public void setDefendantName(String defname)
	{
		DefendantName.sendKeys(defname);
	}
	public void setClaimantName(String cname)
	{
		ClaimantName.sendKeys(cname);
	}
	public void setClaimantSolicitor(String csname)
	{
		ClaimantSol.sendKeys(csname);
	}
	public void setReferenceNumber(String refno)
	{
		RefNo.sendKeys(refno);
	}
	public void saveClaim()
	{
		SaveClaim.click();
	}

	public void liabilityIndicator()
	{
		new WebDriverWait(ldriver, 40).until(ExpectedConditions.elementToBeClickable(LiabilityIndicator));
		LiabilityIndicator.click();
	}

	// Action methods for Yes Option

	public void AwareofSlipTrip_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", awareof_sliptrip_yes);
	}
	public void SlipTripHappen_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", sliptrip_happen_yes);
	}
	public void WorkingDuringTimeofInc_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", workduringtimeofInc_yes);
	}
	public void TaskAllottedwhileIncHappened_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", taskallottedwhileInchapn_yes);
	}
	public void ClmntContinuedWorking_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", clmntcontinuedworking_yes);
	}
	public void BusinessOwnControl_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", businessowncontrol_yes);
	}
	public void IncOccuredOnPremise_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", incOccurrOnpremise_yes);
	}
	public void ClaimantPAYE_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", claimantPAYE_Yes);
	}
	public void AnythingOnFloor_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", AnythingOnfloor_Yes);
	}
	public void PoorDrainage_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", PoorDrainage_Yes);
	}
	public void HazardSlipTrip_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", HazardCausedSlipTrip_Yes);
	}
	public void KnowHazardBefore_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", KnowHazardBefore_Yes);
	}
	public void ResposibleForCleanTidy_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", Resposible4cleanTidy_Yes);
	}
	public void ProtectiveEquipment_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", ProtectiveEquipment_Yes);
	}
	public void ProtectiveEquipmentMitigateRisk_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", ProEqupMitigateRisk_Yes);
	}
	public void TrainingSupervision_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", TrainingSupervision_Yes);
	}
	public void ChangeInProcedures_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", ChangeInProcedures_Yes);
	}
	public void SimilarIncidentsBefore_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", SimilarIncBefore_Yes);
	}
	
	public void AnybodySeeIncident_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", AnybodySeeIncident_Yes);
	}
	public void FollowTrainingProcedure_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", FollowTrainingProcedure_Yes);
	}
	public void IncidentReportedtoYou_YesOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", IncidentReportedtoYou_Yes);
	}
	

	// Action methods for Unknown

	public void ClmntMentnVulnerabilities_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", clmntMentnVulnrblts);
	}
	public void AnythingOnFloor_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", anythingonfloor);
	}
	public void SufficientLighting_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", sufficientlighting);
	}
	public void HandRailSimilar_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", handrailSimilar);
	}
	public void SafetyNoticeHazard_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", safetyNoticeHazard);
	}
	public void RiskAssessHealth_UKOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", riskAssessHealth);
	}
	public void RegularChecks_IncLocation() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", regularchecks);
	}
	public void BusinessResp_CleanTidy() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", BusrespClnTdy);
	}
	public void ProtectiveEquipment() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", protectiveEquip);
	}
	public void TrainingSupervision() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", trainingSupervsn);
	}
	public void ChangeInProcedures() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", changeinProcedures);
	}
	public void SimilarIncBefore() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", similarIncBefore);
	}
	public void AnybodySeeInc() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", anybodySeeInc);
	}
	public void ContributeownInjury() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", contributeOwnInjury);
	}
	public void CorrectTrainingProcedure() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", correctTrainingProcedure);
	}
	public void MedicalAttention() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", medicalAttention);
	}
	public void HowSeriousInjury() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", howSeriousInjury);
	}

	// Action methods for No

	public void ClmntMentnVulnerabilities_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", clmntMentnVulnrblts_No);
	}
	public void ClmntContinuedWorking_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();", clmntcontinuedworking_No);
	}
	public void Thirdpartyrunning_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",thirdpartyrunninloc_No );
	}
	public void SufficientMatting_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",SufcntMatting_No );
	}
	public void SufficientLighting_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",SufcntLighting_No );
	}
	public void HandRail_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",Handrail_No );
	}
	public void SafetyNotice_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",SafetyNotice_No );
	}
	public void SafetyPolicy_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",SafetyPolicy_No );
	}
	public void RegularChecks_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",RegularChecks_No );
	}
	public void IncLocRegularlyClearly_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",Resposible4cleanTidy_Yes );
	}
	public void RecordOfTraining_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",RecordOfTraining_No );
	}
	public void Witness_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",Witness_No );
	}
	public void ImmediateAction_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",ImmediateAction_No );
	}
	public void WitnessProvidestatement_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",WitnessProvidestmnt_No );
	}
	public void ContributeToOwnInjury_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",ContributeOwnInjury_No );
	}
	public void VisibleSignOfInjury_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",VisibleInjury_No );
	}
	public void MedicalAttention_NoOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",MedicalAttention_No );
	}
	
	// Action method for Hazard fluid option

	public void Hazard_Fluid() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",Hazard_Fluid );
	}

	// Action method for Hazard Employee option

	public void Hazard_Employee() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",Hazard_Employee );
	}
	
	//How serious was Injury GP option
	
	public void InjurySeriousness_GPOption() 
	{
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",WentToSeeGP );
	}
	
	//Confirm appearance of liability Indicator
	
	public void ConfirmLiabilityIndicatorAppearance() 
	{
		new WebDriverWait(ldriver, 40).until(ExpectedConditions.elementToBeClickable(LiabilityIndicator));
		JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		executor.executeScript("arguments[0].click();",LiabilityIndicatorappeared_Yes );
	}

	public void Back2Dash()
	{
		new WebDriverWait(ldriver, 40).until(ExpectedConditions.elementToBeClickable(Back2Dshbrd));
		Back2Dshbrd.click();
	}

	public void FileUploadPolicyWord()
	{
		String filePath = System.getProperty("user.dir") + "/TestData/Dummy_Policy.pdf";
		Fileupload.get(0).sendKeys(filePath);
	}
	public void FileUploadPolicyScedule()
	{
		String filePath = System.getProperty("user.dir") + "/TestData/Dummy_Policy.pdf";
		Fileupload.get(1).sendKeys(filePath);
	}
	
	/*
	public void FileUpload1()
	{
		String filePath = System.getProperty("user.dir") + "/TestData/Dummy_Policy.pdf";
		UploadBtns.get(0).sendKeys(filePath);
	}
	public void FileUpload2()
	{
		String filePath = System.getProperty("user.dir") + "/TestData/Dummy_Policy.pdf";
		UploadBtns.get(1).sendKeys(filePath);
	}

*/


}
