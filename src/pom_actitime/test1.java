package pom_actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\acti.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	
	String username=sh.getRow(1).getCell(0).getStringCellValue();
    login1page l1=new login1page(driver);
    l1.enterun(username);
    
	String passward = sh.getRow(1).getCell(1).getStringCellValue();
	l1.enterpwd(passward);
	
	l1.loginbtn();
	
	home1page h1=new home1page(driver);
	String expText=sh.getRow(1).getCell(2).getStringCellValue();
	h1.verifytext(expText);


	
}
}
