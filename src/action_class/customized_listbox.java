package action_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customized_listbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\omkar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.get("https://www.facebook.com/");
	    //click on create new account btn
	    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	    //select month
	    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	    //crete object of actions class
	  Actions act=new Actions(driver);
	  //click on month
	  act.click(month).perform();
	  //move upside by one
	  //act.sendKeys(Keys.ARROW_UP).perform();
	  //move on step down
	  act.sendKeys(Keys.ARROW_DOWN).perform();
	  //click on october
	  act.sendKeys(Keys.ENTER).perform();
	}
}
