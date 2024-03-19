package TestSelenium.Selenium1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Manu Sreeraj";
		String duplicate = s.toLowerCase();
		char[] str = s.toCharArray();
		
		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		
		
		for (char c : str) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
				
			}
			
			else {
				charmap.put(c, 1);
			}	
		}
		
		Set<Character> charset = charmap.keySet();
		for (char c: charset) {
			if(charmap.get(c)>1) {
				System.out.println(c + " : "+ charmap.get(c));
			}
		}

	}

}
