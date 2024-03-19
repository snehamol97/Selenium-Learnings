package TestSelenium.Selenium1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JavaPractice {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("bmw");
		cars.add("mazda");
		cars.add("tesla");
		cars.set(2, "Tesla");
		Collections.sort(cars);
	
		
		
		System.out.println(cars);
		System.out.println(cars.getClass());
		System.out.println(cars.size());
		
		
		
		int[] myArray = {2, 5, 0, 4, 2, 7, 0, 0, 1, 9, 4};

        moveZerosToEnd(myArray);

        // Print the modified array
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        

    }

    static void moveZerosToEnd(int[] arr) {
        int nonZeroCount = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroCount++] = arr[i];
            }
        }

        // Fill remaining positions with zeros
        while (nonZeroCount < arr.length) {
            arr[nonZeroCount++] = 0;
        }
    }

        
        
        
        
        
        
    }
	
  


