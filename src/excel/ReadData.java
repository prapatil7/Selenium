package excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void readData() throws IOException {
		
		String path = "C:\\Users\\user\\Desktop\\test data 123.xlsx";
		File src=new File(path);
	   FileInputStream fis=new FileInputStream(src);
	   XSSFWorkbook  wb=new XSSFWorkbook(fis);
	   XSSFSheet sh=wb.getSheetAt(0);
	   
	   DataFormatter df=new DataFormatter();
	   String value=df.formatCellValue(sh.getRow(1).getCell(0));
	   System.out.println(value);
	} 

	 
	public static void writeData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\BLANK SHEET.xlsx" ;
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh=wb.getSheetAt(0);
		
		File fout=new File(path);
		FileOutputStream fos=new FileOutputStream(fout);
		sh.createRow(2).createCell(2).setCellValue("ranchholdas");
		wb.write(fos);
	}
	public static void main(String[] args) throws IOException {
		writeData();
	}
}
