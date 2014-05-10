package Recursion;

public class CountX {

	public static int countX(String str) {
		  int count = 0;
		  int len = str.length();
		  if (len == 0) {
		    return 0;
		  }
		  if (str.substring(len - 1, len).equals("x")) {
		    count++;
		  }
		  count += countX(str.substring(0, len - 1));
		  return count;
		}
	
	
	public static void main(String[] args) {
		String x = "xxhx";
		System.out.println(countX(x));
	}
}
