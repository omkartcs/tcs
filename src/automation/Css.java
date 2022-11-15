package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	Thread.sleep(3000);
	//enter username
	driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
	//enter passward
	driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("trainee");
	
}
}
