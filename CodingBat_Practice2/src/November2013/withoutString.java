package November2013;

public class withoutString {

	public static String withoutString(String base, String remove) {
		  String base2 = base.toLowerCase();
		  String remove2 = remove.toLowerCase();
		  int lenB = base.length();
		  int lenR = remove.length();
		  if (lenR > lenB) {
			  return base;
		  }
		  String x = "";
		  for (int i = 0; i < lenB; i++) {
			  if (i + (lenR - 1) < lenB) {
				  if (base2.substring(i, i + lenR).equals(remove2)) {
				  i = i + (lenR - 1);
				  continue;
				  }
			  }
			  if (i < lenB) {
				  x = x + base.substring(i, i + 1);
			  }
		  }
		  return x;
		}
	
	
	public static void main(String[] args) {
		
		String base = "This is a FISH";
		String remove = "IS";
		System.out.println(withoutString(base, remove));
	}
}
