package com.cjc.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {
	WebDriver driver;
	//for BillingAdd
	@FindBy(how=How.XPATH ,using ="//input[@id='BillingNewAddress_Company']")
	WebElement company;
	@FindBy(how=How.XPATH ,using="//select[@id='BillingNewAddress_CountryId']")
	WebElement country;
	@FindBy(how=How.XPATH ,using="//input[@id='BillingNewAddress_City']")
	WebElement city;
	@FindBy(how=How.XPATH ,using="//input[@id='BillingNewAddress_Address1']")
	WebElement add1;
	@FindBy(how=How.XPATH ,using="//input[@id='BillingNewAddress_Address2']")
	WebElement add2;
	@FindBy(how=How.XPATH,using="//input[@id='BillingNewAddress_ZipPostalCode']") 
	WebElement postcode;
	@FindBy(how=How.XPATH ,using="//input[@id='BillingNewAddress_PhoneNumber']")
	WebElement phoneno;
	@FindBy(how=How.XPATH ,using="//input[@id='BillingNewAddress_FaxNumber']")
	WebElement faxno;
	@FindBy(how=How.XPATH,using="//input[@class='button-1 new-address-next-step-button']") 
	WebElement continue1;

	//for shipping address
	@FindBy(how=How.XPATH ,using="//input[@onclick='Shipping.save()']")
	WebElement continue2;

	//for shipping method
	@FindBy(how=How.XPATH ,using="//input[@onclick='ShippingMethod.save()']")
	WebElement continue22;

	//for Payment Method
	/*
	 * @FindBy(how=How.CSS ,using="input[id='paymentmethod_2']") WebElement ccard;
	 */
	@FindBy(how=How.CSS ,using="input[class='button-1 payment-method-next-step-button']")
	WebElement continue3;
	

	//for Payment Information
	/*
	 * @FindBy(how=How.CSS ,using="select[class='dropdownlists valid']") WebElement
	 * selectcc;
	 * 
	 * @FindBy(how=How.CSS ,using="input[id='CardholderName']") WebElement cname;
	 * 
	 * @FindBy(how=How.CSS ,using="input[id='CardNumber']") WebElement cno;
	 * 
	 * @FindBy(how=How.CSS ,using="select[id='ExpireMonth']") WebElement exm;
	 * 
	 * @FindBy(how=How.CSS ,using="select[id='ExpireYear']") WebElement exy;
	 * 
	 * @FindBy(how=How.CSS ,using="input[id='CardCode']") WebElement ccode ;
	 */
	@FindBy(how=How.CSS ,using="input[class='button-1 payment-info-next-step-button']")
	WebElement continue4 ;


	public AddressPage(WebDriver driver) {
		this.driver=driver;
	}


	public void forBillingAdd(String comp,String coun,String city1,String adds1,String adds2,String pcode,String phno,String fxno) throws InterruptedException {
		company.sendKeys(comp);
		Select sel=new Select(country);
		sel.selectByVisibleText(coun);
		city.sendKeys(city1);
		add1.sendKeys(adds1);
		add2.sendKeys(adds2);
		postcode.sendKeys(pcode);
		phoneno.sendKeys(phno);
		faxno.sendKeys(fxno);
		Thread.sleep(1000);
		continue1.click();
	}

	public void forShippingAdd() throws InterruptedException {
		Thread.sleep(2000);
		continue2.click();
	}

	public void forShippingMethod() throws InterruptedException {
		Thread.sleep(2000);
		continue22.click();
	}
	public void forpaymentMethod() throws InterruptedException {
		//ccard.click();
		Thread.sleep(2000);
		continue3.click();
	}

	public void forpaymentInformation() throws InterruptedException {
		/*
		 * Select sel1=new Select(selectcc); sel1.selectByVisibleText("Master card");
		 * cname.sendKeys("VAIBHAV SUDHAKARRAO MANIKPURE"); cno.sendKeys("123456789");
		 * Select sel2=new Select(exm); sel2.selectByValue("12"); Select sel3=new
		 * Select(exy); sel3.selectByValue("2025"); cno.sendKeys("5432");
		 */
		Thread.sleep(2000);
		continue4.click();	
	}
}
