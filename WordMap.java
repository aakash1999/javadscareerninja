package careerninjads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordMap {

	public static void main(String[] args) {
		
		String s = "the cat jumped over the table and crashed on the floor but the cat is fine";
		
		Map<String, Integer> countMap = new HashMap<>();
		
		String words[] = s.split(" ");
		
		//System.out.println(Arrays.toString(words));
		
		for(int i = 0;i<words.length;i++) {
			
			if(countMap.containsKey(words[i])) {
				countMap.put(words[i], countMap.get(words[i])+1);
			}else {
				countMap.put(words[i], 1);
			}
		}
		
		System.out.println(countMap);

	}

}
