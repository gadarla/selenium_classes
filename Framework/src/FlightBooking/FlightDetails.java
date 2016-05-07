package FlightBooking;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FlightDetails extends Constant{

	@Test
	public void flightDetailMethod(){
		
		driver.findElement(By.xpath("//input[@value='oneway']")).click();
		driver.findElement(By.name("findFlights")).click();
		driver.findElement(By.name("reserveFlights")).click();
		
	}
	
}
