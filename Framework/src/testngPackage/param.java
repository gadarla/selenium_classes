package testngPackage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param {

	@Test
	@Parameters({"adminUserid","pass"})
	public void login(String userId,String pass){
	System.out.println(userId);
	System.out.println(pass);
	}

	
	
}
