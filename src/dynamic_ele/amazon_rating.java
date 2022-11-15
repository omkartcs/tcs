package dynamic_ele;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class amazon_rating {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 14 max pro 256gb",Keys.ENTER);
    
	driver.findElement(By.xpath("//span[text()='Apple iPhone 13 Pro Max (256GB) - Graphite']")).click();
	Set<String> hand = driver.getWindowHandles();
	
	ArrayList<String> al=new ArrayList<String>(hand);
    Iterator<String> it = al.iterator();
    	String parent = it.next();
    	String child = it.next();
    	driver.switchTo().window(child);
    	
    	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
    
	
	
	
	
}
}
