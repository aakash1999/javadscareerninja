package careerninjads;

import java.util.HashSet;

public class SearchEngine {

	public static void main(String[] args) {
		
		HashSet<String> engine = new HashSet<String>();
		
		engine.add("google");
		engine.add("anime");
		engine.add("music");
		engine.add("laptop");
		
		String input = "harry";
		
		if(engine.contains(input)) { //O(1)
			System.out.println("The result is present");
		}else {
			System.out.println("The result is not present");
		}

	}

}
