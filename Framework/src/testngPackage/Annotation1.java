package testngPackage;
/*import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;*/
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
	
	
	//Logger log = Logger.getLogger("Annotation1");

	
	@BeforeMethod
	public void beforeMethod(){
	//	PropertyConfigurator.configure("C:\\Users\\Swetha\\Documents\\Selenium_classes_Workspace\\Framework\\log4j.properties");
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
		/*log.info("we are in login method");
		log.error("failed due to unable to present");
		log.warn("kjdasjdkj");*/
		//System.out.println("we are in login method");
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
