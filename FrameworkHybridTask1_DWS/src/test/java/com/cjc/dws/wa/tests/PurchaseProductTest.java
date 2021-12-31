package com.cjc.dws.wa.tests;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.cjc.dws.wa.commns.WebCommns;
import com.cjc.dws.wa.pages.AddressPage;
import com.cjc.dws.wa.pages.ConfirmOrderPage;
import com.cjc.dws.wa.pages.ProductPage;
import com.cjc.dws.wa.pages.RegisterPage;
import com.cjc.dws.wa.pages.ShoppingCartPage;

@Listeners(com.cjc.dws.wa.commns.TestListener.class)
public class PurchaseProductTest extends WebCommns{
	WebDriver driver;
	static Logger log=Logger.getLogger(PurchaseProductTest.class.getName());
	
	
	/*
	 * @BeforeSuite public void openBrowser() { driver=WebCommns.BrowserOpen();
	 * log.info("[INFO]opening browser Page---"); }
	 */

	@BeforeSuite
	public void openBrowser() {
		driver=BrowserOpen();
		log.info("[INFO]opening browser Page---");
	}
	
	@BeforeTest
	public void openUrl() {
		
		driver=WebCommns.url();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		log.info("[INFO]opening DWS Registration Page---");
	}

	@BeforeClass
	public void maximizeBrowser() {
		driver.manage().window().maximize();
		log.info("[INFO]maximize browser---");
	}

	@BeforeMethod
	public void getCookies() {
		Set<Cookie> cookies=driver.manage().getCookies();
		int count=cookies.size();
		System.out.println("total no of cookies:"+count);

		for(Cookie cookie:cookies) {
			System.out.println("-----------------------------------");	
			System.out.println("name of cookie"+cookie.getName());
			System.out.println("Domain of cookie"+cookie.getDomain());
			System.out.println("Class of cookie"+cookie.getClass());
			System.out.println("value of cookie"+cookie.getValue());
			System.out.println("path of cookie"+cookie.getPath());
			System.out.println("Expiry of cookie"+cookie.getExpiry());
			System.out.println("Httponly of cookie"+cookie.isHttpOnly());
			System.out.println("secure of cookie"+cookie.isSecure());
		}	
		log.warn("[WARN]get cookies---");
	}

	
	@Test(priority = 1)
	public void register() throws InterruptedException, IOException{
		FileInputStream fis=new FileInputStream("C:\\Users\\Gaurav PC.000\\Downloads\\@selenium automation PR\\FrameworkHybridTask1_DWS\\Report\\HybridFrameworkTask1.xlsx");
		//load the workbook
		XSSFWorkbook xws=new XSSFWorkbook(fis);
		XSSFSheet sheet=xws.getSheet("Sheet1");
		XSSFRow row=sheet.getRow(1);
		XSSFCell col2=row.getCell(2);
		String ge=col2.getStringCellValue();
        XSSFCell col3=row.getCell(3);
        String fn=col3.getStringCellValue();
        XSSFCell col4=row.getCell(4);
        String ln=col4.getStringCellValue();
        XSSFCell col5=row.getCell(5);
        String em=col5.getStringCellValue();
        XSSFCell col6=row.getCell(6);
        String pa=col6.getStringCellValue();
        XSSFCell col7=row.getCell(7);
        String cpa=col7.getStringCellValue();


		String url1=driver.getCurrentUrl();
		Assert.assertEquals(url1,"http://demowebshop.tricentis.com/register");
		RegisterPage rp=PageFactory.initElements(driver, RegisterPage.class);
		rp.fordata(ge,fn,ln,em,pa,cpa);
		rp.registerButton();
		log.info("[INFO] DWS Registration Success---");
	}

	@Test(priority = 2)
	public void Product() throws InterruptedException{
		String url2=driver.getCurrentUrl();
		Assert.assertEquals(url2,"http://demowebshop.tricentis.com/");
		ProductPage pp=PageFactory.initElements(driver, ProductPage.class);
		pp.forBooksData();
		pp.forComputerData();
		pp.forJewelry();
		log.info("[INFO] DWS shopping product added Success---");
	}


	@Test(priority = 3)
	public void shoppingCart() throws InterruptedException{
		ShoppingCartPage scp=PageFactory.initElements(driver, ShoppingCartPage.class);
		scp.forShoppingCart();
		log.info("[INFO] DWS shoppingCart Success---");
	}

	@Test(priority = 4)
	public void Address() throws InterruptedException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Gaurav PC.000\\Downloads\\@selenium automation PR\\FrameworkHybridTask1_DWS\\Report\\HybridFrameworkTask1.xlsx");
		//load the workbook
		XSSFWorkbook xws=new XSSFWorkbook(fis);
		XSSFSheet sheet=xws.getSheet("Sheet2");
		XSSFRow row=sheet.getRow(1);
		XSSFCell col1=row.getCell(1);
		String comp=col1.getStringCellValue();
		XSSFCell col2=row.getCell(2);
		String coun=col2.getStringCellValue();
		XSSFCell col3=row.getCell(3);
		String city1=col3.getStringCellValue();
		XSSFCell col4=row.getCell(4);
		String adds1=col4.getStringCellValue();
		XSSFCell col5=row.getCell(5);
		String adds2=col5.getStringCellValue();
		XSSFCell col6=row.getCell(6);
		String pcode=col6.getStringCellValue();
		XSSFCell col7=row.getCell(7);
		String phno=col7.getStringCellValue();
		XSSFCell col8=row.getCell(8);
		String fxno=col8.getStringCellValue();	
		
		
		AddressPage ap=PageFactory.initElements(driver, AddressPage.class);
		ap.forBillingAdd(comp,coun,city1,adds1,adds2,pcode,phno,fxno);
		ap.forShippingAdd();
		ap.forShippingMethod();
		ap.forpaymentMethod();
		ap.forpaymentInformation();
		log.info("[INFO] DWS addressInfo Success---");
	}

	@Test(priority = 5) 
	public void ConfirmOrder() throws InterruptedException 
	{ ConfirmOrderPage cop=PageFactory.initElements(driver, ConfirmOrderPage.class);
	cop.forConfirmOrder();
	log.info("[INFO] DWS confirmOrder Success---");
	}

	@AfterMethod
	public void captureScreenShot() throws IOException {
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFileToDirectory(src,new File("C:\\Users\\Gaurav PC.000\\Downloads\\@selenium automation PR\\FrameworkHybridTask1_DWS\\ScreenShot"));
		log.warn("[WARN]screen shot capture---");
	}

	@AfterClass
	public void deletCookies() {
		driver.manage().deleteAllCookies();
		log.warn("[WARN]delet cookies---");
	}

	@AfterTest
	public void dbClose() {
		log.warn("[WARN]dbclose---");
	}

	@AfterSuite
	public void closeBrouser() {
		//driver.close();
		log.warn("[WARN]closeDriver---");
	}
}
