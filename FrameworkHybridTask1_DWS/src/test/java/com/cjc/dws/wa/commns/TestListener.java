package com.cjc.dws.wa.commns;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class TestListener implements ITestListener {
	
	public void onStart(ITestContext context) {

		System.out.println("This is our On Start------------------------------@");
	}


	public void onFinish(ITestContext context) {
		System.out.println("This is our On Finish-----------------------------@");
	}

	
	public void onTestStart(ITestResult result) {
		System.out.println("This is our On Test Start-------------------------@");
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("This is our On Test Sucess-------------------------@");
	}


	public void onTestFailure(ITestResult result) {
		System.out.println("This is our On Test Failure-------------------------@");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("This is our On Test Skipped-------------------------@");
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("This is our On Test Skipped----------------------------------------");
		
	}

}
