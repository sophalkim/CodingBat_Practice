package Recursion;

public class EndX {

	public static String endX(String str) {
		int len = str.length();
		int count = 0;
		String x = "";
		if (str.length() < 1) return "";
		if (str.charAt(0) != 'x') {
			x += str.charAt(0);
		} else {
			count++;
		}
		x += endX(str.substring(1));
		if (str.charAt(0) == 'x') {
			x += "x";
			count--;
		}
		if (count > 0) x += endX(str.substring(1));
		return x;
	}
	
	public static String endX2(String str) {
		int len = str.length();
		String x = "";
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (!str.substring(i, i + 1).equals("x")) {
				x += str.substring(i, i + 1);
				count++;
			}
		}
		for (int i = 0; i < len - count; i++) {
			x += "x";
		}
		return x;
	}
	
	public static String endX3(String str) {
		int len = str.length();
		String x = "";
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'x') count++;
		}
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) != 'x') x += str.charAt(i);
		}
		for (int i = 0; i < count; i++) {
			x += "x";
		}
		return x;
	}
	public static void main(String[] args) {
		String str = "xhixhix";
		System.out.println(endX(str));
	}
}
