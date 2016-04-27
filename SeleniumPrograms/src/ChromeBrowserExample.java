import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swetha\\Documents\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");

	}

}
