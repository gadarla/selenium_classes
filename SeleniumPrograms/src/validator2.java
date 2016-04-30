import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class validator2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flightnetwork.com/");
		WebElement element = driver.findElement(By.xpath(".//*[@id='return_date']"));
		System.out.println(element.isEnabled());
		driver.findElement(By.xpath(".//*[@id='trip_type_oneway']")).click();
		System.out.println(element.isEnabled());
	}

}
