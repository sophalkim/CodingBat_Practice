package Recursion;

public class CountHi {

	public static int countHi(String str) {
		  int count = 0;
		  int len = str.length();
		  if (len < 2) {
		    return 0;
		  }
		  if (str.substring(len - 2, len).equals("hi")) {
		    count++;
		  }
		  count += countHi(str.substring(0, len - 1));
		  return count;
		}
	
	
	public static void main(String[] args) {
		String x = "xhixhix";
		System.out.println(countHi(x));
	}
}
