package testNG_program;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotation {
	@BeforeClass
	public void openbrowser() {
		Reporter.log("open the browser",true);
	}
	@BeforeMethod
	public void loginToApp() {
		Reporter.log("login to app",true);
	}
	@Test
	public void userid() {
		Reporter.log("running userid test case",true);
	}
	@AfterMethod
	public void logoutToApp() {
		Reporter.log("logout to application",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close browser",true);
	}
}
