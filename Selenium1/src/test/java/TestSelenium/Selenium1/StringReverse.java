package TestSelenium.Selenium1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;

public class StringReverse {
	
	static String reverseString(String str) {
		String[] wordsArray = str.split(" ");
		StringBuilder obj = new StringBuilder();
		for(int i=wordsArray.length-1; i>=0 ; i--) {
			obj.append(wordsArray[i]);
			if(i>0) {
				obj.append(" ");
			}
		}
		
		return obj.toString();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "the sun is shining";

        // Split the string into an array of words
        
        

        // Convert the array to an ArrayList
        //ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));

       // Print the ArrayList
        System.out.println("Original String: " + s);
        //System.out.println("ArrayList: " + wordsList);
        System.out.println(reverseString(s));

	}

}
