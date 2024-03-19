package TestSelenium.Selenium1;

import java.util.HashMap;
import java.util.Map;

public class CountVowels {
	        

	    static void printDuplicateCharacters(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	    	

	        // Count occurrences of each character
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }

	        // Print duplicate characters and their counts
	        System.out.print("OUTPUT: ");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() > 1) {
	                System.out.print(entry.getKey() + "-" + entry.getValue() + ",");
	            }
	        }
	

}
	    
	    private static boolean isVowel(char c) {
	        //return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	        //return c=='i';
	    	return c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u';
	    }
	
    public static void main(String[] args) {
    	String str = "hcl-techhhh";
        printDuplicateCharacters(str);
        String b = str.concat("   "+ str);
        System.out.println(b);
        
        int x= 20;
        int y =30;
        System.out.println(x+y);
        
        
        
        
        
        String s = "deforestation in the world";

        // Convert the string to lowercase for case-insensitive comparison
        s = s.toLowerCase();

        int vowelCount = 0;

       // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is a vowel
            if (isVowel(c)==true) {
                System.out.print(c + " ");
                vowelCount++;
            }
        }

        System.out.println("\nNumber of vowels: " + vowelCount);
        System.out.println(s.length());
    }
}

    	
    


//int[] num = {2 ,3};
//
//for(int mul : num) {
//	System.out.println("1*" + mul);
//	
//}
//}