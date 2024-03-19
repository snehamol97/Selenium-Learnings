package TestSelenium.Selenium1;




import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetWiki {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();
		System.out.println("pass");
		
//		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//	    
//		
//		WebElement as = driver.findElement(By.id("load-button"));
//	      as.click();
//	      
//	      
//	      wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("load-button")));
//	      
//	      WebElement ab = driver.findElement(By.id("content"));
//	      String test = ab.getText();
	      

	}

}
