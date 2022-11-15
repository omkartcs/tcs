package asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class trues {
@Test
public void tc() {
	Reporter.log("running tc",true);
	boolean actR=true;
	Assert.assertTrue(actR);
}
}
