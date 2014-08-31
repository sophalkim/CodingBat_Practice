
public class FizzString {

	public static String fizzString(String str) {
		String x = "";
		if (str.charAt(0) == 'f') {
			x += "Fizz";
		}
		if (str.charAt(str.length() - 1) == 'b') {
			x += "Buzz";
		}
		if (str.charAt(0) != 'f' && str.charAt(str.length() - 1) != 'b') {
			return str;
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "fib";
		System.out.println(fizzString(str));
	}
}
