
public class FizzString2 {

	public static String fizzString2(int n) {
		if (n % 3 == 0 && n % 5 == 0) {
			return "FizzBuzz!";
		}
		if (n % 3 == 0) {
			return "Fizz!";
		}
		if (n % 5 == 0) {
			return "Buzz!";
		}
		return n + "!";
	}
	
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println(fizzString2(n));
	}
}
