package Recursion;

public class AllStar {

	public static String allStar(String str) {
		String x = "";
		if (str.length() < 1) return "";
		if (str.length() == 1) {
			x += str.substring(0);
		} else {
			x += str.substring(0, 1) + "*";
		}
		x += allStar(str.substring(1));
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(allStar(str));
	}
}
