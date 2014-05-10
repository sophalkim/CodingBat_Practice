package Recursion;

public class NoX {

	public static String noX(String str) {
		  String x = "";
		  int len = str.length();
		  if (len < 1) return "";
		  if (str.startsWith("x")) {
		  } else {
			  x += str.substring(0, 1);
		  }
		  x += noX(str.substring(1));
		  return x;
	}
	
	
	public static void main(String[] args) {
		String x = "xaxb";
		System.out.println(noX(x));
	}
}
