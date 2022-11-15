package asserts;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class fails {
@Test
public void tc1() {
	Reporter.log("running tc1",true);
	Assert.fail();
	System.out.println("running after");
}
public void tc2() {
	Reporter.log("running tc2",true);
}
}
