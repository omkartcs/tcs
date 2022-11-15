package pom_actitime;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_ddf {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//enter passward
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        //click on login 
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		String expText = "Enter Time-Track";	
		 String actText = driver.findElement(By.xpath("//td[text()='Enter Time-Track']")).getText();
		 if(actText.equals(expText)) {
			 System.out.println("tc is pass");
		 }
		 else {
			 System.out.println("tc is fail");
		 }
		 
		

	}
}
