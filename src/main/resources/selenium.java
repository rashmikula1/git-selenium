import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {
public static void takescreenshot(String driver1, String stepname) throws IOException
	
	{
		WebDriver driver= new ChromeDriver();
		driver.get(driver1);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File srcfile= screenshot.getScreenshotAs(OutputType.FILE);
		
		String TCName= "TC_001";
		String dir= System.getProperty("user.dir");
		Timestamp timestamp= new Timestamp(System.currentTimeMillis());
		String path= dir+"src/test/resources/Scrennshots/"+ TCName+"/screeenshot_"+ stepname+"_"+timestamp+".jpeg";
		File destfile= new File(path);
		FileUtils.copyFile(srcfile, srcfile);
		
	}

public static void main(String[] args) {
	
	driver1= "www.google.com";
	stepname= "home";
	takescreenshot(drive1,stepname);
}
}
