package Practice3;

public class EndOther {

	public static boolean endOther(String a, String b) {
		String x = a.toLowerCase();
		  String y = b.toLowerCase();
		  int lenA = a.length();
		  int lenB = b.length();
		  String max = "";
		  String min = "";
		  if (lenA > lenB) {
		    max = x;
		    min = y;
		  } else {
		    max = y;
		    min = x;
		  }
		  int lenX = max.length();
		  int lenN = min.length();
//		  System.out.print("max: " + max + " " + "min: " + min + " ");
//		  System.out.print(lenX + " " + lenN + " ");
		  if (max.substring(lenX - lenN, lenX).equals(min)) {
			  return true;
		  }
		  return false;
		}
	
	
	public static void main(String[] args) {
		
		String a = "abc";
		String b = "abXabc";
		System.out.println(endOther(a, b));
	}
}
