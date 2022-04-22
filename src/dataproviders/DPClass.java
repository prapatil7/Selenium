package dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.batik.apps.rasterizer.Main;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
     
	@DataProvider(name="testdata")
    public static String[][] dpTest() throws IOException
    {
    	String path = System.getProperty("user.dir")+"//Excel Sheet//dataprovidertestdata.xlsx";

		File src = new File(path);

//		to load that particular location to read the data


		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		 XSSFSheet sh1 = wb.getSheetAt(0);
		 
		 int row = sh1.getLastRowNum();
			System.out.println("Total number of rows are : "+row);


			int column= sh1.getRow(0).getLastCellNum();

			System.out.println("Total columns are : "+column);
			
			String[][] data = new String[row+1][column];
			for(int i=0; i<=row; i++)
			{
                for (int j=0; j<=column; j++)
                {
                	data[i][j] = sh1.getRow(i).getCell(i).getStringCellValue();
                }
			}
			
			return data;
			
	
    }
    
    public static void main(String[] args) throws IOException {
		dpTest();
	}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
