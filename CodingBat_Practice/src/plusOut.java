
public class plusOut {
	public static void main(String[] args) {
		String str = "12xy34";
		String word = "xy";
		String result = "";
		for (int i=0; i<str.length(); i++) {
			if (str.substring(i,i+word.length()).equals(word)) {
				result = result + word;
				i++;
			} else {
				result = result + "+";
			}
		}
		System.out.println(result);
	}
}
