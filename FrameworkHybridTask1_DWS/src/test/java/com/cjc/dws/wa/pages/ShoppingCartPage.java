package com.cjc.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCartPage {
	WebDriver driver;
	//for Shopping Cart
	@FindBy(how=How.CSS, using ="li[id='topcartlink'] span[class='cart-label']")
	WebElement shopch1;
	@FindBy(how=How.CSS, using ="select[id='CountryId']")
	WebElement shopch2;
	@FindBy(how=How.CSS, using ="input[id='ZipPostalCode']")
	WebElement shopch3;
	@FindBy(how=How.CSS, using ="input[name='estimateshipping']")
	WebElement shopch4;
	@FindBy(how=How.CSS, using ="input[id='termsofservice']")
	WebElement shopch5;
	@FindBy(how=How.CSS, using ="button[id='checkout']")
	WebElement shopch6;

	public ShoppingCartPage(WebDriver driver) {
		this.driver=driver; 
	}

	public void forShoppingCart() throws InterruptedException {
		Thread.sleep(4000);
		shopch1.click();
		Select sel1=new Select(shopch2);
		sel1.selectByVisibleText("India");
		shopch3.sendKeys("442201");
		shopch4.click();
		shopch5.click();
		Thread.sleep(1000);
		shopch6.click();
	}
}
