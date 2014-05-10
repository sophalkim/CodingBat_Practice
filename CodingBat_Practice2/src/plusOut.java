
public class plusOut {
	public static void main(String[] args) {
		String str = "12xy34xyabcxy";
		String word = "xy";
		String x = "";
		  int y = word.length();
		  for (int i=0; i<str.length(); i++) {
		    if (i<str.length()-y+1 && str.substring(i,i+y).equals(word)) {
		      x = x + word;
		      i = i + y-1; 
		    } else {
		      x = x + "+";
		    }
		  }
		  System.out.println(x);
	}
}
