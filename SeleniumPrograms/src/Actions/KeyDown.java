package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.amazon.ca");
		WebElement element = driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		element.click();
		act.keyDown(Keys.SHIFT).moveToElement(element).sendKeys("smallletters").build().perform();
	}

}
