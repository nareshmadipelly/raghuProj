package SeleniumDemo;

import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DataDrivenDemo extends terminate {
	
	@Before
	public void setup(){
		System.out.println("BEFORE TEST");
	}
	
	@After
	public void tearDown(){
		System.out.println("AFTER TEST");
		super.tearDownTest();
	}
	
	@Test
	public void readExcelData(){
		//launchBrowser();
				System.out.println("TEST CASE");
	
		/*String data=getExcelData(0, 5, 1);
		
		System.out.println(data);
		*/
		
		
		/*File f = new File("C:\\Users\\WINDOWS 8\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(0);
		
		//HSSFWorkbook
		
		int row_num=sheet.getLastRowNum();
		
		int numberof_Columns=sheet.getRow(0).getLastCellNum();
		
		System.out.println("Number of rows in excel are : "+row_num);
		System.out.println("Number of Columns in the excel are ::" +numberof_Columns);
		
		for(int i=0;i<=row_num;i++)
		{
			String username=sheet.getRow(i).getCell(0).getStringCellValue();
			String password=sheet.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println(username);
			System.out.println(password);
		}
		*/
	}
	
	public static String getExcelData(int sheetnumber, int row, int col) throws IOException{
		
		File f = new File("C:\\Users\\WINDOWS 8\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheetAt(sheetnumber);
		
		return sheet.getRow(row).getCell(col).getStringCellValue();
	}

}
