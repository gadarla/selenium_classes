package testngPackage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupsExample {

	@BeforeGroups(groups="sanity")
	public void beforeMethod(){
		System.out.println("we are in before method");
	}
	
	@AfterGroups(groups="sanity")
	public void afterMethod(){
		System.out.println("we are in after method");
	}
	
	@Test(groups={"sanity"})
	public void openBrowser(){
		System.out.println("we are in open browser");
	}
	
	@Test(groups={"sanity"})
	public void login(){
		System.out.println("we are in login method");
		Assert.assertEquals("asdasd", "asda");
	}
	
	@Test(groups={"regression"})
	public void bookFlight(){
		System.out.println("we are in bookflight method");
	}
	
	@Test(groups={"sanity"})
	public void logout(){
		System.out.println("we are in logout method");
	}
	
	
}
