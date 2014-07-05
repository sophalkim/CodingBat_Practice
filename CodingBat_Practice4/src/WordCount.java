
public class WordCount {

	public static int wordCount(String str, String word) {
		int len = str.length();
		int lenW = word.length();
		int count = 0;
		for (int i = 0; i < len - lenW + 1; i++) {
			if (str.substring(i, i + lenW).equals(word)) count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String str = "The day started out cool because I was hanging out with a cool girl";
		String word = "girl";
		System.out.println(wordCount(str, word));
	}
}
