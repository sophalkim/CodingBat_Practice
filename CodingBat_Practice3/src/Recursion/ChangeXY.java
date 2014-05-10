package Recursion;

public class ChangeXY {

	public static String changeXY(String str) {
		  String x = "";
		  if (str.length() < 1) {
			  return "";
		  }
		  if (str.substring(0, 1).equals("x")) {
		      x += "y";
		  } else {
			  x += str.substring(0, 1);
		  }
		  x += changeXY(str.substring(1));
		  return x;
		}
	
	
	public static void main(String[] args) {
		String x = "codex";
		System.out.println(changeXY(x));
	}
}
