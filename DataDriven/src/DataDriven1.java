import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataDriven1 {
	
	@Test
	public void login() throws IOException{
		Properties prp = new Properties();
		FileInputStream src = new FileInputStream("C:\\Users\\Swetha\\Documents\\Selenium_classes_Workspace\\DataDriven\\credentials.properties");
		prp.load(src);
		WebDriver driver = null;
		//System.out.println(prp.getProperty("username"));
		if(prp.getProperty("Browser").equals("firefox")){
			 driver=new FirefoxDriver();
		}else if(prp.getProperty("Browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha\\Documents\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys(prp.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(prp.getProperty("password"));
	}

}
