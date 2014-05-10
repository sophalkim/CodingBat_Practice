package Recursion;

public class Count11 {

	public static int count11(String str) {
		  int count = 0;
		  int x = 0;
		  int len = str.length();
		  if (len < 2) {
		    return 0;
		  }
		  if (str.substring(0, 2).equals("11")) {
		    count++;
		    x++;
		  }
		  count += count11(str.substring(1 + x));
		  return count;
		}
	
	
	public static void main(String[] args) {
		String x = "111";
		System.out.println(count11(x));
	}
}
