package November2013;

import java.util.ArrayList;
import java.util.List;

public class wordsWithoutList {

	public static List wordsWithoutList(String[] words, int len) {
			List<String> list = new ArrayList<String>();
			for (int i = 0; i < words.length; i++) {
				if (words[i].length() != len) {
					list.add(words[i]);
				}
			}
			return list;
		}
	
	
	public static void main(String[] args) {
		
		String[] words = {"a", "bb", "b", "ccc"};
		int len = 3;
		System.out.println(wordsWithoutList(words, len));
	}
}
