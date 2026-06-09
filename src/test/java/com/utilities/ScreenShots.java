package com.utilities;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.Base.BaseClass;

public class ScreenShots  extends BaseClass{
	public static String getInstance(String name) throws Exception {
	String path=System.getProperty("user.dir")+"/ScreenShot/"+name+".png";
	
	TakesScreenshot tks=(TakesScreenshot)driver;
	File sourceFile=tks.getScreenshotAs(OutputType.FILE);
	
	File targetFile= new File(path);
	
	FileHandler.copy(sourceFile, targetFile);
	return path;
	}
}
