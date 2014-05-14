
public class FrontAgain {

	public static boolean frontAgain(String str) {
		int len = str.length();
		if (len < 2) {
			return false;
		}
		if (str.substring(0, 2).equals(str.substring(len - 2, len))) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "ed";
		System.out.println(frontAgain(str));
	}
}
