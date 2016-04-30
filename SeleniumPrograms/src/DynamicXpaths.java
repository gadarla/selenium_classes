import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicXpaths {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://google.ca");
		driver.findElement(By.className("gsfi")).sendKeys("Selenium");
		//Thread.sleep(30000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement block = driver.findElement(By.xpath(".//*[@id='sbtc']/div[2]/div[2]/div[1]"));
		List<WebElement> list = block.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i).getText());
		}
	}

}
