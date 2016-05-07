package testngPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void openUrl(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.ca");
	}
	
	
}
