package com.cjc.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConfirmOrderPage {
	WebDriver driver;
	
	//for confirm order
	@FindBy(how=How.CSS ,using="input[class='button-1 confirm-order-next-step-button']")
	WebElement continue5 ;
	
	//display order
	@FindBy(how=How.CSS ,using="div.page-body.checkout-data > div > ul > li:nth-child(1)")
	WebElement orderNo ;

	public ConfirmOrderPage (WebDriver driver) {
		this.driver=driver;
	}

	public void forConfirmOrder() throws InterruptedException {
		Thread.sleep(1000);
		continue5.click();
		Thread.sleep(2000);
		String ordno=orderNo.getText();
		System.out.println("Order Number:####"+ordno+"####");
	}
}
