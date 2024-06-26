import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		String[] itemNames = { "Brocolli", "Beans", "Potato", "Carrot" };

		Ecommerce.cartItems(driver, itemNames);

	}

	static void cartItems(WebDriver driver, String[] itemNames) {

		List<WebElement> prodNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for (int i = 0; i < prodNames.size(); i++) {
			String name = prodNames.get(i).getText().split("-")[0].trim();
			List<String> itemList = Arrays.asList(itemNames);
			if (itemList.contains(name)) {
				System.out.println("List of items selected - " + name);
				driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			}
		}
		System.out.println("Total items in the cart are : "
				+ driver.findElement(By.xpath("//td[text()='Items']/parent::tr/td[3]/strong")).getText());
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();

		List<WebElement> cartItems = driver
				.findElements(By.xpath("//li[@class='cart-item']//p[@class='product-name']"));

		for (int i = 0; i < cartItems.size(); i++) {
			System.out.println(cartItems.get(i).getText());
		}

		driver.quit();

	}

}
