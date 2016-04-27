import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locator1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.ca");
		
		driver.findElement(By.className("sbib_b")).sendKeys("kjdhfkjsdfhs");
		//Thread.sleep(500);
		//driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
		//driver.findElement(By.linkText("Having trouble?")).click();
		driver.close();
	
	}

}
