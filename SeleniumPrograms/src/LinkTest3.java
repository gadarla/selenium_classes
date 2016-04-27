import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.ca");
		WebElement footer = driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
		//	driver.navigate().back();
			footer = driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
			links = footer.findElements(By.tagName("a"));
		}
	}

}
