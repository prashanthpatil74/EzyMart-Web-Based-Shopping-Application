package com.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static String readConfigData(String data) throws Exception
	{
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\Config.properties";
		FileInputStream file=new FileInputStream(path);
		Properties pro= new Properties();
		pro.load(file);
		return pro.getProperty(data);
	}
}
