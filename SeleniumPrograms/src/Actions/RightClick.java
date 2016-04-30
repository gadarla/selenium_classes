package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		Actions act = new Actions(driver);
		driver.get("https://www.google.ca");
		WebElement element = driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a"));
		act.contextClick(element).sendKeys("L").build().perform();
	}

}
