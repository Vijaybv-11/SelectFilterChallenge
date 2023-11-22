package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Appraoch1 {

		
		static WebDriver driver ;
		public static void  selectList(String FilterName,String subFilterOne, String subFiltertwo, String subFilterthree) {
			driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]")).click();
			driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]/../../../..//span[normalize-space()='"+subFilterOne+"']")).click();
			driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]/../../../..//span[normalize-space()='"+subFiltertwo+"']")).click();
			driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]/../../../..//span[normalize-space()='"+subFilterthree+"']")).click();
		}

		
		  public static void selectList(String FilterName,String subFilterOne, String
		  subFiltertwo) {
		  driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]")).
		  click(); driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+
		  "')]/../../../..//span[normalize-space()='"+subFilterOne+"']")).click();
		  driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+
		  "')]/../../../..//span[normalize-space()='"+subFiltertwo+"']")).click(); }
		 
		
		  public static void selectList(String FilterName,String subFilterOne) {
		  driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+"')]")).
		  click(); driver.findElement(By.xpath("//legend[contains(text(),'"+FilterName+
		  "')]/../../../..//span[normalize-space()='"+subFilterOne+"']")).click(); }
		 
		
		public static void main(String[] args) throws InterruptedException {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.t-mobile.com/tablets");
			Thread.sleep(5000);
			
			selectList("Brands", "Alcatel");
		}

	}

