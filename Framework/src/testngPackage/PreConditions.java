package testngPackage;

import org.testng.annotations.AfterTest;

public class PreConditions {
	public void beforeTest(){
		System.out.println("we are in before test");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("we are in after test");
	}
	
}
