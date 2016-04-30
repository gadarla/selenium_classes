import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs");
		List<WebElement> frames = driver.findElements(By.tagName("frame"));
		for(int i=0;i<frames.size();i++){
			driver.switchTo().frame(i);
			try{
			driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();
			break;
			}
			catch (Exception e){
				driver.switchTo().defaultContent();
			}
		}
	}

}
