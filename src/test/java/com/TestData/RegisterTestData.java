package com.TestData;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RegisterTestData {

	public static String[][] readExcelData() throws Exception {
		String path=System.getProperty("user.dir")+"\\src\\main\\resources\\TestData.xlsx";
		DataFormatter formatter = new DataFormatter();
		XSSFWorkbook workbook = new XSSFWorkbook(path);
	   XSSFSheet sheet= workbook.getSheet("RegisterTestData");
	   int numberOfRows=sheet.getLastRowNum();
	   int numberOfcolumn= sheet.getRow(0).getLastCellNum();
	   String str[][]= new String[numberOfRows][numberOfcolumn];
	   
	   for(int i=0;i<numberOfRows;i++)
	   {
		   XSSFRow row=sheet.getRow(i+1);
		   
		   for(int j=0;j<numberOfcolumn;j++) {
			   str[i][j]=formatter.formatCellValue(row.getCell(j));
		   }
		  
	   }
	   return str;
	}
}
