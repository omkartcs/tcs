package pom_actitime;

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
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	//enter username
	String un=sh.getRow(1).getCell(0).getStringCellValue();
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	//enter passward
	String pwd = sh.getRow(1).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(pwd);
	//click on login 
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	String expText=sh.getRow(1).getCell(2).getStringCellValue();	
	String actText = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
	 if(actText.equals(expText)) {
		 System.out.println("tc is pass");
	 }
	 else {
		 System.out.println("tc is fail");
	 }

}
}
