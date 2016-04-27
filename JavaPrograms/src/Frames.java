import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://ebay.com");
		List<WebElement> myFrames=driver.findElements(By.tagName("frame"));
		System.out.println(myFrames.size());
		for(int i=0;i<myFrames.size();i++)
		{
			driver.switchTo().frame(i);
			try
			{
				driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
				break;
			
			}
			catch(Exception e)
			{
				driver.switchTo().defaultContent();
			}
		}

	}

}
