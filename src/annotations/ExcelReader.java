package annotations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) throws IOException {
	String path= System.getProperty("user.dir")+"\\Excel Sheet\\test data.xlsx";
	System.out.println(path);
//		String path =  FileUtils.getUserDirectoryPath();
//	String path="F:\\SOFTWARE TESTING\\2. Manual Testing 2\\Test case formate.xlsx";

	File src=new File(path);
	FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		
		String data=sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
		
		
		
		
		
		
		
		
		
	}

}
