package asserts;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertequals {
@Test
public void tc() {
	String actR="omkar";
	String expR="omkar";
	Assert.assertEquals(expR,actR);
}
}
