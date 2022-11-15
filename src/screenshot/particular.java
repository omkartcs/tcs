package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class particular {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	WebElement particular = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	File src = particular.getScreenshotAs(OutputType.FILE);
	 File desti = new File("C:\\Users\\omkar\\Desktop\\photo\\sita.jpg");
	 Files.copy(src, desti);
	
}
}