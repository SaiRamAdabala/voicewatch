package com.keyworddrivern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DriverScript {
	
	@Test
	public static void gsetup() throws IOException, InterruptedException
	
	{
		
		String spath="C:\\Users\\asaiprasanth\\Downloads\\EHCM\\MyTools\\curiostesters\\src\\test\\java\\com\\keyworddrivern\\Keywords.xlsx";
		ExcelUtils.setExcelFile(spath, "Sheet1");
		for(int iRow=1;iRow<=7;iRow++)
		{
			String sActionKeywords=ExcelUtils.getCellData(iRow, 3);
			if(sActionKeywords.equals("openBrowser"))
					{
				ActionKeywords.openBrowser();
					}
			else if(sActionKeywords.equals("navigate"))
					{
				ActionKeywords.navigate();
					}
			else if(sActionKeywords.equals("inputUserName"))
					{
				ActionKeywords.inputUserName();
					}
			else if(sActionKeywords.equals("clickNext"))
			{
		ActionKeywords.clickNext();
			}
			else if(sActionKeywords.equals("inputPassword"))
			{
		ActionKeywords.inputPassword();
			}
			
			else if(sActionKeywords.equals("clickSigin"))
			{
		ActionKeywords.clickSigin();
			}
			
			else if(sActionKeywords.equals("closeBrowser"))
			{
		ActionKeywords.closeBrowser();
			}
			
			
			
			
		}
		
		
	}
		
}
