package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class child_browser_popups {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile under 10000",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='REDMI 10 (Pacific Blue, 64 GB)']")).click();
	Thread.sleep(3000);
	//selenium focus on main page to select allwindow get window handle
	Set<String> allwindow = driver.getWindowHandles();
	//store window sequentally
	ArrayList<String> al=new ArrayList<String>(allwindow);
	//adress of main window
	String text = al.get(0);
	System.out.println(text);
	//adress of child window
	String text1 = al.get(1);
	System.out.println(text1);
}
}
