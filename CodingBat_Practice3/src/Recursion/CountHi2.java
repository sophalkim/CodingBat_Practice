package Recursion;

public class CountHi2 {

	public static int countHi2(String str) {
		  int count = 0;
		  int len = str.length();
		  if (len < 2) {
		    return 0;
		  }
		  if (str.substring(len - 2, len).equals("hi")) {
		    count++;
		    if (len > 2 && str.substring(len - 3, len - 2).equals("x")) {
				  count--;
			  }
		  }
		  count += countHi2(str.substring(0, len - 1));
		  return count;
		}
	
	
	public static void main(String[] args) {
		String x = "ahixhi";
		System.out.println(countHi2(x));
	}
}
