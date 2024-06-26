import java.time.Duration;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Iterator<String> wh = driver.getWindowHandles().iterator();
		String parent = wh.next();
		String child = wh.next();
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());
		driver.quit();
	}

}
