package multibrowsing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	WebDriver driver=null;
	@Parameters("browsername")
	@Test
public void tc(String browsername) {
	
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\omkar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        driver=new ChromeDriver();
	}
	else if(browsername.equals("firefox")) { 
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\omkar\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");

        driver=new FirefoxDriver();
	}
	driver.get("https://kite.zerodha.com/");
}
}
