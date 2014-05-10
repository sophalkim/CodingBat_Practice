package Recursion;

public class PairStar {

	public static String pairStar(String str) {
		String x = "";
		if (str.length() < 1) return "";
		if (str.length() != 1 && str.substring(0, 1).equals(str.substring(1, 2))) {
			x += str.substring(0, 1) + "*";
		} else {
			x += str.substring(0, 1);
		}
		x += pairStar(str.substring(1));
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(pairStar(str));
	}
}
