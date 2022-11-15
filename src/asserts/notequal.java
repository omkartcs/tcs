package asserts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class notequal {
@Test
public void tc() {
	String actR="patil";
	String expR="omkar";
	Assert.assertNotEquals(actR,expR);
}
}
