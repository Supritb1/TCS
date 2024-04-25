import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Get the count of total links present in the page

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// getting the count of links present in entire page
		System.out.println("Total count of links in the page is - " + driver.findElements(By.tagName("a")).size());

		// 2. getting the count of links present in footer section.
		// First restrict the scope of the webdriver by select the webelement that is
		// representing the entire footer and then fine the link present inside footer.
		WebElement footerElement = driver.findElement(By.id("gf-BIG"));
		System.out.println("Links count from the footer is - " + footerElement.findElements(By.tagName("a")).size());

		// 3. Select links from the first column of footer and open it in new tab and
		// get then title of each page

		WebElement home = driver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		int size = home.findElements(By.tagName("a")).size();
		for (int i = 0; i < size; i++) {

			String btn = Keys.chord(Keys.CONTROL, Keys.ENTER);

			home.findElements(By.tagName("a")).get(i).sendKeys(btn);

		}

		Set<String> wn = driver.getWindowHandles();
		Iterator<String> it = wn.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}

		driver.quit();
	}
}
