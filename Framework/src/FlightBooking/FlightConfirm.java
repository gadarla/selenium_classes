package FlightBooking;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightConfirm extends Constant{

	@Test
	public void bookFlightlMethod(){
		
		String expValue = "Your itinerary has been booked!";
		String actValue = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		Assert.assertEquals(actValue, expValue);
		
	}
	
}
