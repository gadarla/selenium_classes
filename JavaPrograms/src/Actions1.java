import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		/*Actions act=new Actions(driver);
		WebElement element=driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		act.moveToElement(element).build().perform();
		
		WebElement elem2 = driver.findElement(By.id("twotabsearchtextbox"));
		elem2.click();
		act.keyDown(Keys.SHIFT).moveToElement(elem2).sendKeys("smallletters").build().perform();
		elem2.click();
		act.contextClick(elem2).build().perform();*/
		/*Actions action=new Actions(driver);
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		action.contextClick(gmail).sendKeys("L").build().perform();*/
		
		driver.get("https://jqueryui.com/droppable/");
		Actions action=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		action.dragAndDrop(source, target).build().perform();
		
		
		
		
	}

}
