package Practice3;

public class GetSandwich {

	public static String getSandwich(String str) {
		String x = "bread";
		String y = "";
		int len = str.length();
		for (int i = 0; i < len - 4; i++) {
		    String z = str.substring(i, i + 5);
		    System.out.println(z);
		    if (z.equals(x)) {
		    	System.out.println(len);
		    	for (int j = len - 5; j >= 0; j--) {
		    		String w = str.substring(j, j + 5);
		    		if (w.equals(x)) {
		    			y = str.substring(i + 5, j);
		    			System.out.println(y);
		    			break;
		    		}
		    	}
		    	break;
		    }
		  }
		  return y;
		}
	
	
	public static void main(String[] args) {
		
		String str = "breadbreadbreadbread";
		System.out.println(getSandwich(str));
	}
}
