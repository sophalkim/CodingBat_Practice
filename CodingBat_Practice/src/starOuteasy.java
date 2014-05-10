
public class starOuteasy {
	public static void main(String[] args) {
		  String str = "coo*ool";
		  boolean x = false;
		  int current = 0;
		  for (int i=0; i<str.length(); i++) {
			  if (str.charAt(i)=='*') {
				  current = i;
			  }
		  }
		  int front = current - 1;
		  int back = current + 2;
		  System.out.println(current);
		  System.out.println(front);
		  System.out.println(back);
		  // System.out.println(str.substring(0, 2) + str.substring(5, 7));
	}
}
