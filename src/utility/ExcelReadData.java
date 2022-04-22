package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public static String readExcelData(int sheet_no, int row, int column) throws IOException
	{
	String path="D:\\EXCEL SELENIUM PRACTICE SHEETS\\test data.xlsx";
	  File src=new File(path);
	  FileInputStream fis=new FileInputStream(src);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(sheet_no);
	  
	  DataFormatter df=new DataFormatter();
	  String value = df.formatCellValue(sh.getRow(row).getCell(column));
	  return value;
	}

}
