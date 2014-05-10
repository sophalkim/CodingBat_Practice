package November2013;

public class MirrorEnds {

	public static String mirrorEnds(String str) {
		  int len = str.length();
		  String x = "";
		  for (int i = 0; i < str.length(); i++) {
			  if (str.substring(i, i + 1).equals(str.substring(len - i - 1, len - i))) {
				  x = x + str.charAt(i);
			  } else {
				  break;
			  }
		  }
		  return x;
		}
	
	
	public static void main(String[] args) {
		
		String str = "aba";
		System.out.println(mirrorEnds(str));
	}
}
