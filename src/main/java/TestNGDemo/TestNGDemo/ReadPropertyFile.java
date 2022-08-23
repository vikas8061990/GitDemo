package TestNGDemo.TestNGDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String args[]) throws IOException
	{
	Properties p = new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\VikasBhandari\\newPracticeWorkspace\\TestNGDemo\\src\\main\\java\\TestNGDemo\\TestNGDemo\\Demo.properties");
	p.load(fis);
	String brow = p.getProperty("browser");
	String brow1 = p.getProperty("URL");
	System.out.println("Browser Name = "+brow);
	System.out.println("URL = "+brow1);
	p.setProperty("browser", "MOZILLLLA  FIREFOX");
	FileOutputStream fos=new FileOutputStream("C:\\Users\\VikasBhandari\\newPracticeWorkspace\\TestNGDemo\\src\\main\\java\\TestNGDemo\\TestNGDemo\\Demo.properties");
	p.store(fos, null);
	}
}
