package Practice3;

public class XYZMiddle {

	public static boolean xyzMiddle(String str) {
		  int len = str.length();
		  int middle = len / 2;
		  int front = 0;
		  int back = 0;
		  String x = "";
		  String y = "";
		  for (int i = middle - 2; i < middle + 1; i++) {
		    if (str.substring(i, i + 3).equals("xyz")) {
		    	front = i;
		    	back = i + 3;
		    	x = str.substring(0, front);
		    	y = str.substring(back, len);
		    	System.out.println(len);
		    	System.out.println(front);
		    	System.out.println(back);
		    	System.out.println(x);
		    	System.out.println(y);
		      if (Math.abs(front - (len - back)) <= 1) {
		        return true;
		      }
		    }
		  }
		  return false;
		}
	
	
	public static void main(String[] args) {
		
		String str = "AAxyzBB";
		System.out.println(xyzMiddle(str));
	}
}
