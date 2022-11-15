package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class wscreen {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	driver.manage().window().maximize();
	//typecast
	TakesScreenshot ts=(TakesScreenshot)driver;
	//take screenshot store in ref variable
	File src = ts.getScreenshotAs(OutputType.FILE);
	//create new folder to store sceeenshot
	File desti = new File("C:\\Users\\omkar\\Desktop\\photo\\ram.jpg");
	//copy from src to desti
	Files.copy(src, desti);
	
}
}
