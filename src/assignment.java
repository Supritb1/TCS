import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Suprit Ballurgi");
		driver.findElement(By.name("email")).sendKeys("Suprit.Ballurgi.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Suprit123!");
		driver.findElement(By.id("exampleCheck1")).click();
		// driver.findElement(By.id("exampleFormControlSelect1")).click();
		Select select = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		select.selectByIndex(0);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("23-12-1992");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();

	}

}
