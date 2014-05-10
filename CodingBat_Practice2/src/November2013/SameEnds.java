package November2013;

public class SameEnds {

	public static String sameEnds(String str) {
		  int len = str.length();
		  if (len < 2) {
			  return "";
		  }
		  String x = "";
		  for (int i = 1; i < (len / 2) + 1; i++) {
			  if (str.substring(0, i).equals(str.substring(len - i, len))) {
				  x = str.substring(0, i);
			  }
		  }
		  return x;
		}
	
	
	public static void main(String[] args) {
		
		String str = "xxxx";
		System.out.println(sameEnds(str));
	}
}
