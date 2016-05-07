package FlightBooking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BookFlight extends Constant {

	@Test
	public void bookFlightlMethod(){
		
		driver.findElement(By.name("passFirst0")).sendKeys("abcd");
		driver.findElement(By.name("passLast0")).sendKeys("hahgshags");
		driver.findElement(By.name("creditnumber")).sendKeys("54545445554");
		driver.findElement(By.name("buyFlights")).click();
		
	}
	
}
