package dynamic_ele;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\july11.xlsx");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.get("https://www.facebook.com/");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	String num = sh.getRow(3).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(num);
	
	
	String num1 = sh.getRow(3).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(num1);
	driver.findElement(By.xpath("//button[@name='login']")).click();
	

}
}
