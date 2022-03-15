package com.TestNG.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	XSSFWorkbook wb;
	public ExcelData() 
	{
		File src=new File("./testData/testData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			 wb=new XSSFWorkbook(fis);
		
		} catch (IOException e) 
		{			
			System.out.println("unable to read excel file"+e.getMessage());
		}
	}
	
	public String getStringData(String name, int row, int column)
	{
		return wb.getSheet(name).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getNumericData(String name, int row, int column)
	{
		return wb.getSheet(name).getRow(row).getCell(column).getStringCellValue();		
	}


}
