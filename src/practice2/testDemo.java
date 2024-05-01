package practice2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testDemo {
	
	@Test(groups = "Functional")
	public void testFunctional2() {
		System.out.println("testFunctional2");
		
	}

	
	@Test (groups = "Functiomal")
	public void testFunctional3() {
		System.out.println("testFunctional3");
	}
	
	@Test(groups = "Regression")
	public void testRegression3() {
		System.out.println("testRegression3");
		Assert.assertTrue(false);
	}

}
