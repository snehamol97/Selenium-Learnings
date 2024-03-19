package Inheritance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Test {
	

	
	public void tesyt2() {
		
int[] arr = {10, -9, 3, 2, 6, 7, 4, 1, 0, -2,  9};
		
		int length = arr.length;
		int sum =0;
		
		for(int i = 0; i<length; i++) {
			if(arr[i]>=0) {
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write the function to return the sum of all neutral (positive) integers from an array
				 
				//Input array: {10, -9, 3, 2, 6, 7, 4, 1, 0, -2,  9}
		

			// Go to ‘https://the-internet.herokuapp.com/hovers
					//hover over the first image
					//Assert that on hover there is text that is displayed below ’name: user1’
					
					WebDriver driver = new ChromeDriver();
					driver.get("https://the-internet.herokuapp.com/hovers");
					
					WebElement image = driver.findElement(By.xpath("//img[@alt = 'User Avatar']//following::h5[contains(text(),'user1')]"));
					
					Actions act = new Actions(driver);
					act.moveToElement(image).perform();
					
					
					String username = image.getText();
					
					Assert.assertEquals(username, "name: user1", "the expected image is correct");
			
		
		
	}
		

	}


