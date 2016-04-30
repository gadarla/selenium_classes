import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		WebElement block = driver.findElement(By.xpath("//input[@name='group1']"));
		List<WebElement> list = block.findElements(By.xpath("//input[@name='group1']"));
		System.out.println(list.size());
		for (int i=0;i<list.size();i++){
			String text = list.get(i).getAttribute("value");
			if(text.equals("Cheese")){
				list.get(i).click();
				System.out.println(list.get(i).getAttribute("value")+"--->"+list.get(i).getAttribute("checked"));
			}
		}
	}

}
