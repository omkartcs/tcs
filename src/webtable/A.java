package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/omkar/Downloads/WebTable%20by%20ANKUSH%20(1).html");
	String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(sn);
	
	String cit = driver.findElement(By.xpath("//table[@border='3']//th[3]")).getText();
	System.out.println(cit);
	
	String sac = driver.findElement(By.xpath("//table[@id='2244']//td[2]")).getText();
	System.out.println(sac);
	String shil = driver.findElement(By.xpath("//table[@id='2244']/descendant::td[11]")).getText();
	System.out.println(shil);
	
	String row2 = driver.findElement(By.xpath("//table[@id='2244']//tr[3]")).getText();
	System.out.println(row2);
	
	String row4 = driver.findElement(By.xpath("//table[@id='2244']//tr[5]")).getText();
	System.out.println(row4);
}
}
