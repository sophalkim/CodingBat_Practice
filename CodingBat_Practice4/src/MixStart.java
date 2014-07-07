
public class MixStart {

	public static boolean mixStart(String str) {
		if (str.length() < 3) {
			return false;
		}
		if (str.substring(1, 3).equals("ix")) {
			return true;
		}
		return false;	
	}
	
	
	public static void main(String[] args) {
		String str = "mix snacks";
		System.out.println(mixStart(str));
	}
}
