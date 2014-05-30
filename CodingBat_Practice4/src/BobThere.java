
public class BobThere {

	public static boolean bobThere(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
				return true;
			}
		}
		return false;	
	}
	
	
	public static void main(String[] args) {
		String str = "b9b";
		System.out.println(bobThere(str));
	}
}
