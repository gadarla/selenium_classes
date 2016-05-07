package testngPackage;

import org.testng.annotations.Test;

public class Annotation2 {


	@Test(groups={"regression"})
	public void logout(){
		System.out.println("we are in logout method");
	}
	
}
