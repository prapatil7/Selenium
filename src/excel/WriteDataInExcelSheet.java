package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcelSheet {
	public static void main(String[] args) throws IOException  {
//		String path=System.getProperty("user.dir")+"\\BLANK SHEET.xlsx";
		String path="D:\\EXCEL SELENIUM PRACTICE SHEETS\\BLANK SHEET.xlsx";
		File src=new File(path);
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		File fout=new File(path);
		FileOutputStream fos=new FileOutputStream(fout);
		sheet.createRow(1).createCell(0).setCellValue("Mendeleev");
		wb.write(fos);
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
