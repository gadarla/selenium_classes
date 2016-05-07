import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriven2 {
	WebDriver driver;
	@BeforeTest
	public void openBrowser(){
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void linkTest() throws IOException{
		FileInputStream src = new FileInputStream("C:\\Users\\Swetha\\Documents\\Selenium_classes_Workspace\\DataDriven\\links.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(src);
		XSSFSheet ws = wb.getSheet("Sheet1");
		Iterator<Row> row = ws.iterator();
		row.next();
		while(row.hasNext()){
			Row r = row.next();
			try{
			String linkName = r.getCell(0).getStringCellValue();
			driver.findElement(By.linkText(linkName)).click();
			String actUrl = driver.getCurrentUrl();
			r.createCell(2).setCellValue(actUrl);
			String expUrl = r.getCell(1).getStringCellValue();
			if(actUrl.equals(expUrl)){
				r.createCell(3).setCellValue("PASS");
			}else{
				r.createCell(3).setCellValue("FAIL");
			}
			driver.navigate().back();
			}
			
			catch(Exception e){
				r.createCell(3).setCellValue("Invalid link name");
			}
			
			FileOutputStream dest = new FileOutputStream("C:\\Users\\Swetha\\Documents\\Selenium_classes_Workspace\\DataDriven\\links.xlsx");
			wb.write(dest);
		}
	}
	
}
