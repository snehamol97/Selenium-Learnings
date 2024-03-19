package TestSelenium.Selenium1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "java selenium java java selenium key Java word key";
		String duplicate = s.toLowerCase();
		System.out.println(duplicate);
		
		String[] arr = duplicate.split(" ");
		
		Map<String, Integer> strmap = new HashMap <String, Integer>();
		
		for(String words : arr) {
			if (strmap.containsKey(words)) {	
				strmap.put(words, strmap.get(words)+1);
			}
			
			else {
				strmap.put(words.toLowerCase(), 1);
			}		
		}
		
		Set<String> dupwords = strmap.keySet();
		
		for(String words : dupwords) {
			if(strmap.get(words)>1) {
				System.out.println(words + strmap.get(words));
			}
		}
	}

}
