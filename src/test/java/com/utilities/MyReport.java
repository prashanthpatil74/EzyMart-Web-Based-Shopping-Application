package com.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class MyReport {
	public static ExtentReports reports() {
	ExtentSparkReporter spark= new ExtentSparkReporter("Report/TestReport.html");
	spark.config().setDocumentTitle("Automation Test Report");
	spark.config().setReportName("Regression Testing");
	spark.config().setTheme(Theme.DARK);
	
	ExtentReports reports= new ExtentReports();
	reports.setSystemInfo("Environment","QA");
	reports.setSystemInfo("Tester Name","Iranna");
	reports.setSystemInfo("OS","Windows");
	reports.setSystemInfo("Browser","Chrome");
	
	reports.attachReporter(spark);
	
	return reports;
	}
}
