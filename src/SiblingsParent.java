import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingsParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browser launched");
		driver.get("https://www.rahulshettyacademy.com/");
		System.out.println("Title - " + driver.getTitle());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//ul[@class='navigation clearfix']/li[2]")).click();
		System.out.println(driver
				.findElement(By.xpath("//ul[@class='navigation clearfix']/li[2]/following-sibling::li[2]")).getText());
		System.out.println(driver
				.findElement(By.xpath("//ul[@class='navigation clearfix']/li[1]/parent::ul/parent::div")).getText());
		driver.navigate().back();
		driver.close();

	}

}
