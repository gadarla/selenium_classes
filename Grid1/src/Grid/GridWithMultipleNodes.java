package Grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridWithMultipleNodes {

	@Parameters({"browser","platform","remoteurl"})
	@Test
	public void testLogin(String browser,Platform platform,String remoteurl) throws MalformedURLException{
		
		DesiredCapabilities cap = null;
		if(browser.equals("firefox")){
			cap = DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(platform);
		}else if(browser.equals("chrome")){
			cap = DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(platform);
		}else if(browser.equals("iexplore")){
			cap = DesiredCapabilities.internetExplorer();
			cap.setBrowserName("iexplore");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver = new RemoteWebDriver(new URL(remoteurl), cap);
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("abcd");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		}
		

}
