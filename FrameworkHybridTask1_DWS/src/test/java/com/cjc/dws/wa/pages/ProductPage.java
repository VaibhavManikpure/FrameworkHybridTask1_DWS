package com.cjc.dws.wa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
	WebDriver driver;
	//for book selection
	@FindBy(how=How.CSS, using ="ul[class='list'] a[href='/books']")
	WebElement books;
	@FindBy(how=How.CSS, using ="img[src='http://demowebshop.tricentis.com/content/images/thumbs/0000130_computing-and-internet_125.jpeg']")
	WebElement sbook;
	@FindBy(how=How.CSS, using ="input[name='addtocart_13.EnteredQuantity']")
	WebElement qty1;
	@FindBy(how=How.CSS, using ="input[id='add-to-cart-button-13']")
	WebElement add1;

	//for computer selection
	@FindBy(how=How.CSS, using ="div[class='listbox'] a[href='/computers']")
	WebElement computers;
	@FindBy(how=How.CSS, using ="img[src='http://demowebshop.tricentis.com/content/images/thumbs/0000003_desktops_125.jpg']")
	WebElement scomputer;
	@FindBy(how=How.CSS, using ="img[src='http://demowebshop.tricentis.com/content/images/thumbs/0000172_build-your-own-cheap-computer_125.jpeg']")
	WebElement sscomputer;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_72_5_18_65']")
	WebElement sel1;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_72_6_19_55']")
	WebElement sel2;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_72_3_20_58']")
	WebElement sel3;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_72_8_30_95']")
	WebElement sel4;
	@FindBy(how=How.CSS, using ="input[id='addtocart_72_EnteredQuantity']")
	WebElement qty2;
	@FindBy(how=How.CSS, using ="input[id='add-to-cart-button-72']")
	WebElement add2;
	
	//for jewelry selection
	@FindBy(how=How.CSS, using ="li[class='inactive'] a[href='/jewelry']")
	WebElement jewelry;
	@FindBy(how=How.CSS, using ="img[src='http://demowebshop.tricentis.com/content/images/thumbs/0000171_create-your-own-jewelry_125.jpeg']")
	WebElement sjewelry;
	@FindBy(how=How.CSS, using ="select[id='product_attribute_71_9_15']")
	WebElement sel11;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_71_10_16']")
	WebElement sel12;
	@FindBy(how=How.CSS, using ="input[id='product_attribute_71_11_17_49']")
	WebElement sel13;
	@FindBy(how=How.CSS, using ="input[name='addtocart_71.EnteredQuantity']")
	WebElement qty11;
	@FindBy(how=How.CSS, using ="input[id='add-to-cart-button-71']")
	WebElement add11;
	
	
	public ProductPage(WebDriver driver) {
		this.driver=driver; 
	}
	
	public void forBooksData(){
		books.click();
		sbook.click();
		qty1.clear();
		qty1.sendKeys("2");
		add1.click();
	}

	public void forComputerData(){
		computers.click();
		scomputer.click();
		sscomputer.click();
		sel1.click();
		sel2.click();
		sel3.click();
		sel4.click();
		qty2.clear();
		qty2.sendKeys("1");
		add2.click();
	}

	public void forJewelry() throws InterruptedException{
		jewelry.click();
		sjewelry.click();
		Select sel=new Select(sel11);
		sel.selectByIndex(2);
		sel12.sendKeys("10");
		sel13.click();
		qty11.clear();
		qty11.sendKeys("3");
		add11.click();	
		Thread.sleep(2000);
	}

}
