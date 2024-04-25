
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Intro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver", "D:/Rahul
		// Shetty/Drivers/chromedriver-win64/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "D:/Rahul Shetty/Drivers/edgedriver_win64/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("john");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();

		System.out.println("closing the browser");
		driver.close();

	}

}
