package testngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class DataProvider1{

	@Test(dataProvider="testData")
	public void login(String user, String password){
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("https://facebook.com");
	driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.id("loginbutton")).click();
	driver.close();
	}
	
		
	@DataProvider(name="testData")
	public Object [] [] getAccounts(){
		Object[][] inputdata =new Object[2][2];
		inputdata[0][0] = "userone";
		inputdata[0][1] = "pass1";
		
		inputdata[1][0] = "usertwo";
		inputdata[1][1] = "pass2";
		return inputdata;
		}
	
}
