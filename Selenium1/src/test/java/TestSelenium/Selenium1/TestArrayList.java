package TestSelenium.Selenium1;

public class TestArrayList {
	static void moveZerosToEnd(int[] arr, int elementToMove) {
	    int nonZeroCount = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] != elementToMove) {
	            int temp = arr[i];
	            arr[i] = arr[nonZeroCount];
	            arr[nonZeroCount] = temp;
	            nonZeroCount++;
	           
	        }
	    }
	}
	
	static void moveZerosToStart(int[] arr, int elementToMove) {
	    int zeroCount = arr.length-1;
	    
	    for (int i = arr.length-1; i >=0; i--) {
	        if (arr[i] != elementToMove) {
	            int temp = arr[i];
	            arr[i] = arr[zeroCount];
	            arr[zeroCount] = temp;
	            zeroCount--;
	           
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To move all zeros  to start
		
		int[] myArray = {9,6,5,0,3,2,0,8,0,6} ;
		
		
		
		moveZerosToStart(myArray, 0);
		for (int num : myArray) {
            System.out.print(num + " ");	
		}

		moveZerosToEnd(myArray, 0);
		for (int num : myArray) {
            System.out.print(num + " ");	
		}
		

	}
	


}
