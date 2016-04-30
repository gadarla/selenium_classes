package CaptureScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VideoRecording {

	public static void main(String[] args) throws ATUTestRecorderException {
	ATUTestRecorder recorder = 
			new ATUTestRecorder("D:\\recorder", "login",false);
	WebDriver driver = new FirefoxDriver();
	recorder.start();
	driver.get("http://facebook.com");
	driver.findElement(By.id("email")).sendKeys("abcd");
	driver.findElement(By.id("pass")).sendKeys("12345");
	driver.findElement(By.id("loginbutton"));
	driver.close();
	recorder.stop();

	}

}
