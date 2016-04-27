import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		String expTitle = "Gmail";
		driver.get("https://www.google.ca/ ");
		driver.findElement(By.linkText("Gmail")).click();
		String actualTitle = driver.getTitle();
		System.out.println(driver.getTitle());
		if(actualTitle.equals(expTitle)){
			System.out.println("element present");
		}else{
			System.out.println("element is not present");
		}
		
	}

}
