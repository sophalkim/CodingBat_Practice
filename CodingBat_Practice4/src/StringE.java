
public class StringE {

	public static boolean stringE(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i ++) {
			if (str.charAt(i) == 'e') {
				count++;
			}
		}
		if (count >= 1 && count <= 3) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(stringE(str));
	}
}
