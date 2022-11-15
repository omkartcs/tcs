package actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.manage().deleteAllCookies();
	driver.get("https://demo.actitime.com/login.do");
	
	driver.findElement(By.id("username")).sendKeys("admin");
	
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	driver.findElement(By.xpath("//input[@id='taskSearchControl_field']")).sendKeys("omkar");
	
	String actt = driver.getTitle();
	System.out.println(actt);
	
	 String expt = "actiTIME - Enter Time-Track";
	 if(actt.equals(expt)) {
		 System.out.println("tc is pass");
	 }
	 else {
		 System.out.println("tc is fail");
	 }
	
}
}
