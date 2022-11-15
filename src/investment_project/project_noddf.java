package investment_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project_noddf {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://login-v2.upstox.com/");
    //enter username
    driver.findElement(By.xpath("//input[@id='userCode']")).sendKeys("2QALQX");
    //enter passward
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Pnishi@321");
    //click on login
    driver.findElement(By.xpath("//div[text()='Sign into Upstox']")).click();
    //enter dob
    driver.findElement(By.xpath("//input[@id='yob']")).sendKeys("1995");
    //click on no iam good
    driver.findElement(By.xpath("//div[text()='No, I’m good']")).click();
    String expTitle="Upstox Pro";
    String actTitle=driver.getTitle();
    if(actTitle.equals(expTitle)) {
    	System.out.println("tc is pass");
    }
    else {
    	System.out.println("tc is fail");
    }
}	
}

