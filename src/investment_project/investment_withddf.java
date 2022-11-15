package investment_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class investment_withddf {
public static void main(String[] args) throws Throwable {
	FileInputStream fis=new FileInputStream("C:\\Users\\omkar\\Documents\\investment.xlsx");
	Sheet sh = WorkbookFactory.create(fis).getSheet("Sheet1");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://login-v2.upstox.com/");
    //enter username
    String un = sh.getRow(0).getCell(0).getStringCellValue();
    driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys(un);
    //enter pwd
    String pwd=sh.getRow(0).getCell(1).getStringCellValue();
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
    //click on login
    driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
    //enter dob
    String dob=sh.getRow(0).getCell(2).getStringCellValue();
    driver.findElement(By.xpath("//input[@id='yob']")).sendKeys(dob);
  //click on no iam good
    driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
    String expTitle="Upstox Pro";
    String actTitle=driver.getTitle();
    if(actTitle.equals(expTitle)) {
    	System.out.println("tc is pass");
    }
    else {
    	System.out.println("tc is fail");
    }

    

    
}
}
