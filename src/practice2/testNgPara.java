package practice2;

import org.testng.annotations.Test;

public class testNgPara {
	
	
	
	@Test(groups = "Smoke")
	public void testSmoke1() {
		System.out.println("testSmoke1");
	}

	@Test(groups = "Regression")
	public void testRegression1() {
		System.out.println("testRegression1");
	}
	
	@Test(groups = "Smoke")
	public void testSmoke2() {
		System.out.println("testSmoke2");
	}
	
}
