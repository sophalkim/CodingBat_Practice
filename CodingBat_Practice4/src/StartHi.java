
public class StartHi {

	public static boolean startHi(String str) {
		int len = str.length();
		if (len < 2) {
			return false;
		}
		return str.substring(0, 2).equals("hi");	
	}
	
	
	public static void main(String[] args) {
		String str = "hi there";
		System.out.println(startHi(str));
	}
}
