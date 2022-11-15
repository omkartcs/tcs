import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/?client_id=DCS-TYasnEfnL5ydgqK3I9AL478Q&redirect_uri=https://developer.upstox.com/auth");
      driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("omkar");
      driver.findElement(By.xpath("//input[@id='password']")).sendKeys("patil");
      driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
	}
}
