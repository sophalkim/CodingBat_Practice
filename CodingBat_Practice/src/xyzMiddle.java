
public class xyzMiddle {
	public static void main(String[] args) {
		String x = "AAxyzBB";
		String y = "AAAAAxyzBBB";
		String z = "AxyzBBB";
		int middle = z.length()/2;
		System.out.println(z.indexOf("y"));
		System.out.println(middle);
	}
	/*
	 if (str.length()<=2) {
    return false;
  }
  int middle = str.length()/2;
  for (int i=0; i<str.length(); i++) {
    if (middle>=str.indexOf("y")) {
      return true;
    }
  }
  return false; 
	 */
}
