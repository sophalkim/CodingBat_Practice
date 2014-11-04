
public class ReverseString {

	public static void reverse(String str) {
		int len = str.length();
		String reverse = "";
		int index = len;
		for (int i = len - 1; i >= 0; i--) {
			if (Character.isWhitespace(str.charAt(i))) {
				reverse += str.substring(i, index);
				index = i;
			}
		}
		for (int i = 0; i < len; i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				reverse += " " + str.substring(0, i);
				break;
			}
		}
		System.out.println(reverse);
	}
	
	
	public static void main(String[] args) {
		String x = "My name is Sophal";
		reverse(x);
	}
}
