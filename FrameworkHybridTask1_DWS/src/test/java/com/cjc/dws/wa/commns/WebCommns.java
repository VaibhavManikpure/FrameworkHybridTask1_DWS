package com.cjc.dws.wa.commns;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommns {
	static WebDriver driver;
	/*
	 * static public WebDriver BrowserOpen() {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\Users\\Gaurav PC.000\\Downloads\\@selenium automation PR\\FrameworkHybridTask1_DWS\\Driver\\new chrome driver 90.0.4430.212\\chromedriver_win32\\chromedriver.exe"
	 * ); driver=new ChromeDriver(); return driver; }
	 */
	
	    public WebDriver BrowserOpen() {
		System.setProperty("webdriver.chrome.driver", "F:\\chromeDriver1\\ChromeDriver96\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		return driver;
		}
	
	    static public WebDriver url() {
		driver.get("http://demowebshop.tricentis.com/register");
		return driver;
	}


}
