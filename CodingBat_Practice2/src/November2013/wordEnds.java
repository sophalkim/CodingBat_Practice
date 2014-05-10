package November2013;

public class wordEnds {

	public static String wordEnds(String str, String word) {
		String x = "";
		int len = str.length();
		int len2 = word.length();
		for (int i = 0; i < len - len2 + 1; i++) {
			if (str.substring(i, i + len2).equals(word)) {
				
				if (i != 0) {
					x = x + str.substring(i - 1, i);
				}
				if (i + len2 != len) {
					x = x + str.substring(i + len2, i + len2 + 1);
				}
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "XY1XY";
		String word = "XY";
		
		System.out.println(wordEnds(str, word));
	}
}
