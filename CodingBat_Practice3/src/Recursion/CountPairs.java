package Recursion;

public class CountPairs {

	public static int countAbc(String str) {
		  int count = 0;
		  int len = str.length();
		  if (len < 3) {
		    return 0;
		  }
		  String x = "abc";
		  String y = "aba";
		  if (str.substring(0, 3).equals(x) || str.substring(0, 3).equals(y)) {
		    count++;
		  }
		  count += countAbc(str.substring(1));
		  return count;
		}
	
	
	public static void main(String[] args) {
		String x = "abaxxaba";
		System.out.println(countAbc(x));
	}
}
