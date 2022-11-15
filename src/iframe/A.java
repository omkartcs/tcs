package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
	driver.manage().window().maximize();
	//switch to first name
	driver.switchTo().frame("packageListFrame");
	//take element from first frame and print
	String text1 = driver.findElement(By.xpath("//a[text()='org.openqa.selenium.edge']")).getText();
	System.out.println(text1);
	
	Thread.sleep(4000);
	driver.switchTo().defaultContent();
	driver.switchTo().frame("packageFrame");
	 String text2 = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
	 System.out.println(text2);
	 
	 Thread.sleep(4000);
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("classFrame");
	 String text3 = driver.findElement(By.xpath("//a[text()='By.Remotable']")).getText();
	 System.out.println(text3);
}
}
