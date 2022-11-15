package investment_project;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ulc {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://login-v2.upstox.com/");
    upstoxlogin1page up=new upstoxlogin1page(driver);
    up.enterun();
    up.enterpwd();
    up.login();
    upstoxlogin2page uq=new upstoxlogin2page(driver);
    uq.enterdob();
    upstoxlogin3page uw=new upstoxlogin3page(driver);
    uw.entergood();
    		
}
}
