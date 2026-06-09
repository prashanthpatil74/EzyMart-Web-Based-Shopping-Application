package com.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class MyListener implements ITestListener{
	public static Logger log=LogManager.getLogger(MyListener.class);
	public ExtentReports report;
	public ExtentTest test;
	@Override
	public void onStart(ITestContext context) {
		 report=MyReport.reports();
	}
	@Override
	public void onTestStart(ITestResult result) {
	  test=report.createTest("Test Case");
	  log.info("Test Case Execution Started "+result.getName());
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS, "Test Case Pass ");
		log.info("Test Case Pass "+result.getName());
	}
	@Override
	public void onTestFailure(ITestResult result) {
		String ss=null;
		test.log(Status.FAIL, "Test Case fail ");
		try {
			 ss=ScreenShots.getInstance(result.getName());
		} catch (Exception e) {
		}
	   test.addScreenCaptureFromPath(ss);
	   log.info("Test Case Failed !"+result.getName());
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, "Test Case Skip ");
		log.info("Test Case Skipped "+result.getName());
	}
	@Override
	public void onFinish(ITestContext context) {
		report.flush();
		log.info("All Test Case Executed Successfully ");
	}
}
