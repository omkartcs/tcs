package testNG_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority = 3)
	public void tc1() {
		Reporter.log("running tc1",true);
	}
	@Test(priority = 1)
	public void tc2() {
		Reporter.log("running tc2",true);
	}
	@Test(priority = 2)
	public void tc3() {
		Reporter.log("running tc3",true);
	}
}
