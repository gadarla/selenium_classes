import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBox {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		WebElement chk = driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_StudentDiscount']"));
		chk.click();
		System.out.println(chk.isSelected());
	}

}
