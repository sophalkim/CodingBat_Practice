package November2013;

public class scoreUp {

	public static int scoreUp(String[] a, String[] b) {
		  int count = 0;
		  for (int i = 0; i < a.length; i++) {
			  if (b[i] == a[i]) {
				  count = count + 4;
			  }
			  if (b[i] != a[i]) {
				  if (b[i] == "?") {
				  } else {
					  count--;
				  }
			  }
		  }
		  return count;
		}
	
	
	public static void main(String[] args) {
		
		String[] a = {"a", "a", "b", "b"};
		String[] b = {"a", "a", "b", "b"};
		System.out.println(scoreUp(a, b));
	}
}
