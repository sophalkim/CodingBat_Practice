import java.util.Scanner;


public class Decomposition_String {
	static Scanner sc = new Scanner(System.in);
	static String word = "";
	public static void main(String[] args) {
		System.out.println("Please type in a word ");
		word = sc.next();
		System.out.println(triple(word));
	}
	
	public static String triple(String x) {
		x = x+x+x;
		return x;
	}
}
