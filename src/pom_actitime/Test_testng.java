package pom_actitime;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_testng {
	Sheet sh;
	WebDriver driver;
	login_testngpage l;
	home_testngpage h;
	
@BeforeClass
public void openbrowser() throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\actitestng.xlsx");
	sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	
	 l=new login_testngpage(driver);
	 h=new home_testngpage(driver);
}
	@BeforeMethod
	public void logintoapp() {
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		l.enterun(username);
		String passward = sh.getRow(0).getCell(1).getStringCellValue();
		l.enterpwd(passward);
		l.loginbtn();
	}
	@Test
	public void verifytexts() {
		Reporter.log("running tc",true);
		String expText = sh.getRow(1).getCell(2).getStringCellValue();
		String actText = h.verifytext();
		

		Assert.assertEquals(expText,actText,"both are not equal");

	}
	@AfterMethod
	public void logout() {
		Reporter.log("logout from app",true);
	}
	@AfterClass 
	public void closebrowser() {
		Reporter.log("close the browser",true);	
	}
	

}
