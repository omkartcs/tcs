package asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class falses {
	@Test
	public void tc() {
		Reporter.log("running tc",true);
		boolean actR=false;
		Assert.assertFalse(actR);
	}

}
