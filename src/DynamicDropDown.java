import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[@value='IXG']")).click();
		System.out.println(driver.findElement(By.xpath("//a[@value='IXG']")).getText());
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']"))
				.click();
		System.out.println(driver
				.findElement(
						By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='AMD']"))
				.getText());
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).getText());
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		System.out.println("Before clicking " + driver.findElement(By.id("Div1")).getAttribute("style"));
		boolean str1 = driver.findElement(By.id("Div1")).getAttribute("style").contains("1");

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println("After clicking " + driver.findElement(By.id("Div1")).getAttribute("style"));
		boolean ele = driver.findElement(By.id("Div1")).getAttribute("style").contains("1");

		// Assert.assertEquals(ele, str1);
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("calendar is enabled");
			Assert.assertTrue(str1);

		} else {
			System.out.println("calendar is disabled");
			Assert.assertTrue(str1);
		}
		driver.quit();
	}

}
