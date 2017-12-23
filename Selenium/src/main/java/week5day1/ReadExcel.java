package week5day1;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {
	
	@Test
	public void readCreateMethod() throws IOException, InvalidFormatException{
		File excel=new File("C:/Selenium/Selenium/Data/CreateLead.xlsx");
	XSSFWorkbook workbook=new XSSFWorkbook(excel);
	XSSFSheet sheet=workbook.getSheetAt(0);
	int rowCount=sheet.getLastRowNum();
	int rowCol=sheet.getRow(0).getLastCellNum();
	
	
	
	for (int i = 1; i <= rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j < rowCol; j++) {
			XSSFCell cell = row.getCell(j);
			String cellValue = cell.getStringCellValue();

			System.out.println(cellValue);
		} 
	}
	
	
	}

}
