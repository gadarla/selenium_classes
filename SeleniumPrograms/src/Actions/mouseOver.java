package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOver {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.amazon.ca");
		WebElement element= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		act.moveToElement(element).build().perform();
		System.out.println(driver.findElement(By.xpath(".//*[@id='nav-flyout-yourAccount']")).isDisplayed());

	}

}
