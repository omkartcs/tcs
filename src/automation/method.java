package automation;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class method {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.google.com");
	
	driver.manage().window().maximize();
	
	Thread.sleep(3000);
	driver.manage().window().minimize();
	
	Dimension d=new Dimension(100, 200);
	driver.manage().window().setSize(d);
	
	Point p=new Point(300, 400);
	driver.manage().window().setPosition(p);
	
	String s=driver.getCurrentUrl();
	System.out.println(s);
	
	 String page=driver.getPageSource();
	 System.out.println(page);
	 
	 String title=driver.getTitle();
	 System.out.println(title);
	 
	 
	
	
}
}
