package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flightnetwork.com");
		WebElement element = driver.findElement(By.xpath(".//*[@id='adult']"));
		element.click();
		Select s = new Select(element);
		s.selectByVisibleText("6");
	}

}
