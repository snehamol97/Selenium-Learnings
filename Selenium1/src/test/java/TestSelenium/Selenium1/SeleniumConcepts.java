package TestSelenium.Selenium1;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SeleniumConcepts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		System.out.println(title + "  " + URL);
		WebElement mens = driver.findElement(By.xpath("//a[contains(@class, 'leftCategoriesProduct') and contains(.,\"Men's Fashion\")]"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(mens));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mens).perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", mens);
		WebElement sports = driver.findElement(By.xpath("//li[@navindex='1']//span[contains(text(),'Sports Shoes') and contains(@class,'linkTest')]"));
		js.executeScript("arguments[0].click();", sports);
		
		String destinationPath = "C:\\Users\\bhavy\\OneDrive\\Desktop\\Sneha";
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile.toPath(), new File(destinationPath).toPath());


	    // Scroll down to the end of the page
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        WebElement lehenga = driver.findElement(By.xpath("//div[contains(text(),'Popular Links')]//following::a[contains(text(),'Lehenga')]"));
		lehenga.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.close();
		
			

	}

}
