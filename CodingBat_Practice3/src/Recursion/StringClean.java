package Recursion;

public class StringClean {

	public static String stringClean(String str) {
		  String x = "";
		  int y = 0;
		  if (str.length() < 1) {
			  return "";
		  }
		  if (str.length() > 1 && str.substring(0, 1).equals(str.substring(1, 2))) {
			  if (str.length() > 2 && str.substring(0, 1).equals(str.substring(2, 3))) {
				  x += str.substring(0, 1);
				  y += 2;
			  } else {
				  x += str.substring(0, 1);
				  y++;
			  }
		  } else {
			  x += str.substring(0, 1);
		  }
		  x += stringClean(str.substring(1 + y));
		  return x;
		}
	
	
	public static void main(String[] args) {
		String x = "yyzzza";
		System.out.println(stringClean(x));
	}
}
