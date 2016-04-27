import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumSample {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha\\Documents\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver","C:\\Users\\Swetha\\Documents\\IEDriverServer.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://www.facebook.com");
		
//input id="email" class="inputtext" type="email" tabindex="1" value="" name="email"/
		//tagName[@attribute=‘value’]
		//input[@id='email']
		//*[@name='email']
		//input id="u_0_y" type="submit" tabindex="4" value="Log In"
		//input[@value='Log In']
		/*driver.get("https://www.amazon.ca");
		WebElement footer = driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
		List<WebElement> links = footer.findElements(By.tagName("a"));
		for (int i=0;i<links.size();i++){
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			 footer = driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
			 links = footer.findElements(By.tagName("a"));*/
		}
		
		//driver.findElement(By.xpath("//*[@id='Wrapper']/footer/div[1]/div/div/div[1]/div/div[1]/div/div[1]/nav")
		/*WebElement general=driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
		List<WebElement> links=general.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		//	Sleeper.sleepTightInSeconds(7);
			general=driver.findElement(By.xpath("//*[@id='navFooter']/table/tbody/tr/td[1]/ul"));
			links=general.findElements(By.tagName("a"));
		}*/
		//driver.get("https://www.google.ca");
		//driver.findElement(By.xpath("//div[@id='main']/span/center/div[3]/div[1]/div/a")).click();
		//driver.findElement(By.cssSelector("._XIi")).click();
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcd");
		//driver.findElement(By.className("inputtext")).sendKeys("abcd");
		//driver.findElement(By.xpath("//input[@value='Log In']")).click();
		//System.out.println(driver.getTitle());
		//driver.navigate().back();
		//driver.findElement(By.linkText("Having trouble?")).click();
		//driver.close();

	

}
