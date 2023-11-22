package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Approach2 {
	
	static WebDriver driver;
	  public static void selectList(String mainFilterValue, String... subFilterValues) {
			driver.findElement(By.xpath("//legend[contains(text(),'"+mainFilterValue+"')]")).click();
		for (int i = 0; i < subFilterValues.length; i++) {
			String subFiltertext = subFilterValues[i];
			driver.findElement(By.xpath("//legend[contains(text(),'"+mainFilterValue+"')]/../../../..//span[normalize-space()='"+subFiltertext+"']")).click();
		}
	  }
	  
	  public static void main(String[] args) throws InterruptedException {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.t-mobile.com/tablets");
			Thread.sleep(5000);
			
			selectList("Brands", "Alcatel","TCL");
	}
	  }

