import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {

	/*@BeforeTest
	public void beforeTest(){
		System.out.println("we are in before test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("we are in after test");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("we are in before class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("we are in after class");
	}*/
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("we are in before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("we are in after method");
	}
	
	@Test(enabled=false)
	public void openBrowser(){
		System.out.println("we are in open browser");
	}
	
	@Test(priority=2)
	public void login(){
		System.out.println("we are in login method");
		Assert.assertEquals("asdasd", "asda");
	}
	
	@Test(dependsOnMethods={"login"},alwaysRun=true)
	public void bookFlight(){
		System.out.println("we are in bookflight method");
	}
	
	@Test(priority=4)
	public void logout(){
		System.out.println("we are in logout method");
	}
	
	
}
