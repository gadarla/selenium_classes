import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {
	static FirefoxDriver driver=new FirefoxDriver();
	public static void main(String[] args) {
		/*FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://bing.com");
	
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				break;
			}
	}*/
		
		/*Set<String> s = new HashSet<>();
		s.add("selenium");
		s.add("QTP");
		s.add("selenium1");
		System.out.println(s.size());
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		driver.get("http://bing.com");
		String title1=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> windowids=driver.getWindowHandles();
		Iterator<String> it=windowids.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			String title2=driver.getTitle();
			if(!title1.equals(title2))
			{
				driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();
				System.out.println(driver.getTitle());
				break;
			}
			System.out.println(driver.getTitle());
		}
		System.out.println(driver.getTitle());
	}
}
