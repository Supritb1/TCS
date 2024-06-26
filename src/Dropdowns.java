import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chromedriver", "D:/RahulShetty/Drivers/edgedriver_win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByValue("USD");
		System.out.println(select.getFirstSelectedOption().getText());
		select.selectByVisibleText("INR");
		System.out.println(select.getFirstSelectedOption().getText());

	}

}
