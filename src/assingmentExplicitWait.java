import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assingmentExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.findElement(By.cssSelector("[id='username']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("learning");
		driver.findElement(By.xpath("//span[text()=' User']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(dropdown);
		select.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Shop Name']")));

		List<WebElement> addToCart = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for (int i = 0; i < addToCart.size(); i++) {
			addToCart.get(i).click();
		}

		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

		driver.findElement(By.xpath("//button[@class='btn btn-success']")).isDisplayed();
		System.out.println(driver.findElement(By.xpath("//button[@class='btn btn-success']")).getText());

		driver.quit();
	}

}
