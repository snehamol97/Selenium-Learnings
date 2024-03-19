package TestSelenium.Selenium1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	
	public static void checkBroken (String LinkURL) throws Exception {
		
		try {
			
			HttpURLConnection con = (HttpURLConnection) new URL(LinkURL).openConnection();
			int code = con.getResponseCode();
			
			if (code >= 400) {
				
				System.out.println("link is broken");
				
			}	
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
			
	}
	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for( WebElement e : links) {
			String s = e.getAttribute("href");
//			if(s != null && !s.isEmpty()) {
//				try {
//					checkBroken(s);
//				} catch (Exception e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			
//		}
		
		
		driver.close();		

	}
	}
	
}
