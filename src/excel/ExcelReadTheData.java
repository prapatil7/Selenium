package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadTheData {
	
	public static void main(String[] args) throws IOException {
		
		// TO READ THE DATA FROM EXCEL SHEET
		File src=new File("D:\\EXCEL SELENIUM PRACTICE SHEETS\\Book1.xlsx");
		FileInputStream fis=new FileInputStream(src);
	    XSSFWorkbook wb=new XSSFWorkbook(fis);
	    XSSFSheet sheet=wb.getSheetAt(0);
	    String value1=sheet.getRow(1).getCell(1).getStringCellValue();
	    System.out.println(value1);
		String value2=sheet.getRow(3).getCell(2).getStringCellValue();
		System.out.println(value2);
		
		// BY USING DATA FORMATTER
		
		DataFormatter df=new DataFormatter();
		String val1=df.formatCellValue(sheet.getRow(4).getCell(1));
		String val2 = df.formatCellValue(sheet.getRow(5).getCell(2));
		System.out.println(val1);
	    System.out.println(val2);
		
	    // FOR READING ALL DATA FROM EXCEL SHEET
		
	    
	    for (int row1=0; row1<=5; row1++)
	    {
	    	for (int col1=0; col1<=2; col1++)
	    	{
	    		String itr1= sheet.getRow(row1).getCell(col1).getStringCellValue();
	    	}
	    }
	    
	    //by using data formatter
		for (int row=0; row<=5; row++)
		{
		   for (int column=0; column<=2; column++)
		   {
			String itr = df.formatCellValue(sheet.getRow(row).getCell(column));
	           System.out.println(itr);
	           
		   }
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
