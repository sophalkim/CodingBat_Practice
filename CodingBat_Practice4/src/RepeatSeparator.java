
public class RepeatSeparator {

	public static String repeatSeparator(String word, String sep, int count) {
		if (count <= 0) {
			return "";
		}
		if (count <= 1) {
			return word;
		}
		String x = "";
		for (int i = 0; i < count; i++) {
			x += word;
			if (i + 1 < count) {
				x += sep;
			}
		}
		return x;	
	}
	
	
	public static void main(String[] args) {
		String word = "Word";
		String sep = "X";
		int count = 3;
		System.out.println(repeatSeparator(word, sep, count));
	}
}
