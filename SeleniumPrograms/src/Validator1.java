import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validator1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.makemytrip.com/flights");
		WebElement element = driver.findElement(By.xpath(".//*[@id='return_date_sec']"));
		System.out.println(element.isDisplayed());
		driver.findElement(By.xpath(".//*[@id='multi_city_button']/span")).click();
		System.out.println(element.isDisplayed());
	}

}
