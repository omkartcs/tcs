package asserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class failbysoft {
	public class assertequals {
		@Test
		public void tc1() {
			String actR="hi";
			String expR="bye";
			SoftAssert s=new SoftAssert();
			s.assertEquals(actR,expR);
			System.out.println("running after 1st verification");
			s.assertAll();
		}
		@Test
		public void tc2() {
			Reporter.log("running tc2",true);
		}
}
}
