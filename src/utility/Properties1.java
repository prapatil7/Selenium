package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties1 {
	
  public static void main(String[] args) throws IOException {
	Properties prop=new Properties();
	String path = System.getProperty("user.dir")+"\\config.properties";
	
	FileInputStream fis=new FileInputStream(path);
	prop.load(fis);
	
	String url=prop.getProperty("username");
	System.out.println(url);
	
	
	
	
	
	
	
  }


}