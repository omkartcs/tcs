package actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_ddf {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\acti.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	
	String id = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.id("username")).sendKeys(id);
	
	String pass = sh.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pass);
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	String text = sh.getRow(3).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys(text);
	
	String title = driver.getTitle();
	String expt = sh.getRow(2).getCell(0).getStringCellValue();
	if(title.equals(expt)) {
		System.out.println("tc is pass");
	}
	else {
		System.out.println("tc is fail");
	}
}
}