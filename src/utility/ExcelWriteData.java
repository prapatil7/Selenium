package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteData {
	public static void writeExcel(int sheet_index, int row, int column, String data) throws IOException {
	String path= System.getProperty("user.dir")+"\\BLANK SHEET.xlsx";
	File src=new File(path);
	FileInputStream fis=new FileInputStream(src);
    XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sh=wb.getSheetAt(sheet_index);
    
    File fout=new File(path);
    FileOutputStream fos=new FileOutputStream(fout);
    
    sh.createRow(column).createCell(column).setCellValue(data);
   
	}
}
