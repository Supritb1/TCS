package practice2;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testResult {

	
	@Test(groups = {"Functional"})
	public void testFunction1() {
		System.out.println("testFunctional1 and Smoke");
	}

	
	@Test (dataProvider = "getData", groups = "Smoke")
	public void testRegression2(String user, String pass) {
		System.out.println(user+" == "+pass);
	}
	
	@Parameters({"url","username","password"})
	@Test(groups = "Smoke")
	public void testSmoke3(String url, String username ,String password) {
		System.out.println("testSmoke3 - "+url+" - "+username+" - "+password);
	}
	
	@DataProvider
	public String[][] getData() {
		
		String[][] a=new String[3][2];
		
		a[0][0]="user1";
		a[0][1]="password1";
		a[1][0]="user2";
		a[1][1]="password2";
		a[2][0]="user3";
		a[2][1]="password3";
		
		return a;
		
	}
	
}
