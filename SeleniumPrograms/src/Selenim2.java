import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenim2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.ca");
		//driver.findElement(By.xpath("//input[@id='gs_htif0']")).sendKeys("selenium");
		driver.findElement(By.cssSelector("._XIi")).click();

	}

}
