
public class sameEnds {
	public static void main(String[] args) {
		String string = "Hello! and Hello!";
		int x = string.length();
		String y = "";
		boolean z = false;
		for (int i=0; i<x/2; i++) {
			if (string.substring(0, i+1).equals(string.substring(x-i-1,x))) {
				y = string.substring(0, i+1);
				z = true;
			}
			if (z) {
				if (!string.substring(0, i+1).equals(string.substring(x-i-1,x))) {
//					return y;
				}
			}
		}
		System.out.println(y);
	}
}
