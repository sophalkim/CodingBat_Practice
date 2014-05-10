
public class xyzMiddle2 {
	public static void main(String[] args) {
		String z = "xyzAxyzBBB";
		int y = z.indexOf("y");
		int length = z.length();
		int right = length-y-1;
		System.out.println(y);
		System.out.println(length);
		System.out.println(right);
		
	}
	/*
	 public boolean xyzMiddle(String str) {
	  if (str.length()<=2) {
	    return false;
	  }
	  int left = str.indexOf("y");
	  int length = str.length();
	  int right = length-left-1;
	  if (Math.abs(right-left)<=1) {
	    return true;
	  }
	  return false;
  
}
	 */
}
