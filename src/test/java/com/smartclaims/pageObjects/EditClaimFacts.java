package com.smartclaims.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditClaimFacts {
	
	WebDriver ldriver;

	//Creating a constructor for Edit claim facts page
	
	
	public EditClaimFacts(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Locating search field
	
	@FindBy(xpath="/html/body/app-root/div[2]/div/div/div/app-dashboard/div[2]/div/div[1]/form/div/div[1]/div/div[1]/div/input")
	
	WebElement SearchField;
	
	//Locating Search submit
	
	@FindBy(xpath="/html/body/app-root/div[2]/div/div/div/app-dashboard/div[2]/div/div[1]/form/div/div[1]/div/div[3]/div/button[2]")
	
	WebElement SearchButton;
	
	//Locating Card Settings button
	
	
	@FindBy(className="card_more_dropdown")
	WebElement CardSettingsbtn;
	
	//Locating edit claim facts
	
	@FindBy(xpath="/html/body/app-root/div[2]/div/div/div/app-dashboard/div[2]/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li/ul")
	WebElement Editclaimfacts;
	
	//Wizard next button
		
	@FindBy(xpath="//*[@id=\"iqwizardDiv\"]/iq-wizard/div/div[3]/div[2]/div/div[3]/button")
	WebElement WizardNextbtn;
	
	//*[@id="iqwizardDiv"]/iq-wizard/div/div[3]/div[2]/div/div[3]/button
	
	//*[@id="iqwizardDiv"]/iq-wizard/div/div[3]/div[2]/div/div[3]/button
	

	
	//Wizard save button
	@FindBy(className="iQswiper_saveBtn")
	WebElement WizardSavebtton;
	
	public void searchfield(String searchkey)  //setting password parameter to use in test cases
	{
		SearchField.sendKeys(searchkey);
	}
	
	public void clickSearchSubmit()

	{		
		SearchButton.click();
	}
	
	public void clickCardSettings()

	{		
		CardSettingsbtn.click();
	}
	
	public void Editclaimfactsbtn()

	{		
		Editclaimfacts.click();
	}
	
	public void WizardNextBtn()

	{		
		WizardNextbtn.click();
	}
	
	public void WizardSaveBtn()

	{		
		WizardSavebtton.click();
	}
}