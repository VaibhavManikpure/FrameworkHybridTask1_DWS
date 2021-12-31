package com.cjc.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class RegisterPage {
	WebDriver driver;
	@FindBy(id ="gender-male")
	WebElement mgender;

	@FindBy(id ="gender-female")
	WebElement fgender;

	@FindBy(how=How.CSS, using ="input#FirstName")
	WebElement fname;

	@FindBy(how=How.CSS, using ="input#LastName")
	WebElement lname;

	@FindBy(how=How.CSS, using ="input#Email")
	WebElement email;

	@FindBy(how=How.CSS, using ="input#Password")
	WebElement pass;

	@FindBy(how=How.CSS, using ="input#ConfirmPassword")
	WebElement cpass;

	@FindBy(how=How.CSS, using ="input#register-button")
	@CacheLookup
	WebElement regButton;

	@FindBy(how=How.CSS, using ="input[class='button-1 register-continue-button']")
	@CacheLookup
	WebElement continueButton;

	public RegisterPage(WebDriver driver) {
		this.driver=driver; 
	}

	public void fordata(String ge,String fn,String ln,String eml,String pa,String cpa) {
		if(	ge.equalsIgnoreCase("male")) {
		mgender.click();
		}else if(ge.equalsIgnoreCase("female")){
		fgender.click(); 
		}
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		email.sendKeys(eml);
		pass.sendKeys(pa);
		cpass.sendKeys(cpa);
	}

	public void registerButton() throws InterruptedException {
		Thread.sleep(3000);
		regButton.click();
		continueButton.click();
	}
}
