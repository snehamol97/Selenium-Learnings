package TestSelenium.Selenium1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "abcdcba";
		String b = "";
		System.out.println(a);
		
		//int count = 0;
		
			for (int i=a.length()-1; i>=0; i--) {
				b = b+ a.charAt(i);
			
				//count --;	
 
			}

		System.out.println(b);
		
		Boolean check = a.equalsIgnoreCase(b);
		System.out.println(check);
		StringBuffer ab = new StringBuffer(a);
		String reverse = ab.reverse().toString();
		if(reverse.equals(a)) {
			System.out.println("the string is a palindrome");
		}
		
		String s1= "test";
		String s2 = "test";
		
		if(s1==s2) {
		System.out.println("hh");
		}

	}

}
