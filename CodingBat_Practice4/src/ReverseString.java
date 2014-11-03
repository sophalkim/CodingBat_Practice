
public class ReverseString {

	public static void reverse(String str) {
		int len = str.length();
		String reverse = "";
		for (int i = len - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		System.out.println("The reverse string is: " + reverse);
	}
	
	
	public static void main(String[] args) {
		String x = "Hello World";
		reverse(x);
	}
}
