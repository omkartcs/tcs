package testNG_program;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
@Test
public void login() {
	Reporter.log("running login tc",true);
}
@Test(dependsOnMethods = {"login"})
public void logout() {
	Reporter.log("running logout tc",true);
}
}
