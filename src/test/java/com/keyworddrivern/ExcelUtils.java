package com.keyworddrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	@Test(priority=1)
	public static void setExcelFile(String path,String sheetName) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		
		workbook=new XSSFWorkbook(fis);
		sheet=workbook.getSheet(sheetName);
	}
	
	@Test(priority=2)
	public static String getCellData(int row,int column)
	{
		Cell cell=sheet.getRow(row).getCell(column);
		String  celllData=cell.getStringCellValue();
		return celllData;
		
	}
	
	
	
}
