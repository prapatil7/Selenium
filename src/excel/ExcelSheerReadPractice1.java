package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheerReadPractice1 {
	public static void main(String[] args) throws IOException {
		
		File src=new File("D:\\EXCEL SELENIUM PRACTICE SHEETS\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		
		String val1=sheet.getRow(0).getCell(0).getStringCellValue();
		String val2=sheet.getRow(0).getCell(1).getStringCellValue();
		String val3=sheet.getRow(0).getCell(2).getStringCellValue();
		
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		
		//DATA FORMATTER
		
		DataFormatter df=new DataFormatter();
        String value1=df.formatCellValue(sheet.getRow(3).getCell(1));
        System.out.println(value1);
        
        
        // READ ALL THE DATA FROM EXCEL SHEET
        for (int row=0; row<=6; row++)
        {
        	for (int column=0; column<=2; column++)
        	{
        		System.out.println(df.formatCellValue(sheet.getRow(row).getCell(column)));
        		
        	}
        }
        
        for (int row1=0; row1<=6; row1++)
        {
        	for (int col1=0 ; col1<=2; col1++)
        	{
              System.out.println( sheet.getRow(row1).getCell(col1).getStringCellValue());
        	}
        }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
