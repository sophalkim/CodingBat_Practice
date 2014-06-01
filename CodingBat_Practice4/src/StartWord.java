
public class StartWord {

	public static String startWord(String str, String word) {
		int len = str.length();
		int lenW = word.length();
		if (lenW > len) {
			return "";
		}
		if (lenW <= 1) {
			return str.substring(0, 1);
		}
		if (str.substring(1, lenW).equals(word.substring(1, lenW))) {
			return str.substring(0, lenW);
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		String str = "hippo";
		String word = "xip";
		System.out.println(startWord(str, word));
	}
}
