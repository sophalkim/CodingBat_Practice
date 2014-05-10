
public class sameEnds2 {
	public static void main(String[] args) {
		
	String string = "Hello! and Hello!";
	int len = string.length();
	  String x = "";
	  for(int i = len/2; i > 0; i--){
	    if(string.substring(0,i).equals(string.substring(len - i, len))) {
	      x = x + string.substring(0, i);
	      break;
	    }
	  }
	  System.out.println(x);
	}
}
