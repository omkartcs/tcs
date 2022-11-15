package actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\insta.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.get("https://www.instagram.com/");
	String username = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	
	FileInputStream fir=new FileInputStream("C:\\Users\\omkar\\Documents\\insta.xlsx");
	Sheet she = WorkbookFactory.create(fir).getSheet("Sheet1");
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@class='_2hvTZ pexuQ zyHYP']")).sendKeys(pass);
	
	
	
}
}
