package com.guaren.ecommerce.Listners;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListners extends TestListenerAdapter {
	 @Override
	  public void onTestSuccess(ITestResult tr) {
		 System.out.println(tr.getTestContext().getCurrentXmlTest().getName() + "Test success");
	 }
	  
	  

	  @Override
	  public void onTestFailure(ITestResult tr) {
		  System.out.println(tr.getTestContext().getCurrentXmlTest().getName() + "Test failure");
	  }
	  
	  
	  @Override
	  public void onStart(ITestContext testContext) {
		  System.out.println(testContext.getCurrentXmlTest().getName() + "Test started");
		 
	  }

	  @Override
	  public void onFinish(ITestContext testContext) {
		  System.out.println(testContext.getCurrentXmlTest().getName() + "Test finish");
	  
	
	
	

}}
