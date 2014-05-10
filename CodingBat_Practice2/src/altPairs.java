
public class altPairs {
	public static void main(String[] args) {
		String str = "kitten";
		String x = "";
		for (int i=0; i<str.length(); i=i+4) {
			  if (i+2>str.length()) {
			    x = x + str.substring(i, i+1);
			  } else {
			    x = x + str.substring(i, i+2);
			  }
			  }
		System.out.println(x);
	}
}
