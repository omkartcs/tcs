package dynamic_ele;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worldometer {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	driver.get("https://www.worldometers.info/coronavirus/country/india/");
	
	String cases = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[1]")).getText();
	System.out.println(cases);
	
	String death = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[2]")).getText();
	System.out.println(death);
	
	String recovered = driver.findElement(By.xpath("(//div[@class='maincounter-number'])[3]")).getText();
	System.out.println(recovered);
}
}
