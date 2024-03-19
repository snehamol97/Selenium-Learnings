package TestSelenium.Selenium1;

public class MinMaxOfanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// keeping the first element as min or max and  comparing it with every other element
		int[] a = {12, 56, 24, 32, 41 ,-41};
		
		//first element as min
		int min = a[0];
		
//		
//		for(int i=1; i<a.length; i++) {
//			if(min > a[i]) {
//				min = a[i];
//			}	
			
			for(int i=1; i<a.length; i++) {
				if(min > a[i]) {
					min = a[i];
				}
			
		}
		System.out.println("minimum value of an array : " + min);
		

	}

}
