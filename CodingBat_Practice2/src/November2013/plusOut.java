package November2013;

public class plusOut {
  
	public static String plusOut(String str, String word) {
		int len = str.length();
		int len2 = word.length();
		String x = "";
		for (int i = 0; i < len; i++) {
			if (i + len2 - 1 < len && str.substring(i, i + len2).equals(word)) {
				x = x + word;
				i = i + len2 - 1;
			} else {
				x = x + "+";
			}
		}
		return x;
	}
	
	public static void main(String[] args) {
	
		String str = "12xy34";
		String word = "xy";
		
		System.out.println(plusOut(str, word));
	}
}
