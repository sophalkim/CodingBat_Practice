package November2013;

public class matchUp {

	public static int matchUp(String[] a, String[] b) {
		  int count = 0;
		  for (int i = 0; i < a.length; i++) {
			  if (b[i].length() != 0 && a[i].length() != 0) {
				  if (b[i].charAt(0) == a[i].charAt(0)) {
					  count++;
				  }
			  }
		  }
		  return count;
		}
	
	
	public static void main(String[] args) {
		
		String[] a = {"aa", "bb", "cc"};
		String[] b = {"", "", "ccc"};
		System.out.println(matchUp(a, b));
	}
}
