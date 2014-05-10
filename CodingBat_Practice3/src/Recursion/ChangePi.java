package Recursion;

public class ChangePi {

	public static String changePi(String str) {
		  String x = "";
		  int y = 0;
		  int len = str.length();
		  if (len < 1) return "";
		  if (len > 1 && str.startsWith("pi")) {
		      x += "3.14";
		      y++;
		  } else {
			  x += str.substring(0, 1);
		  }
		  x += changePi(str.substring(1 + y));
		  return x;
	}
	
	
	public static void main(String[] args) {
		String x = "pipi";
		System.out.println(changePi(x));
	}
}
