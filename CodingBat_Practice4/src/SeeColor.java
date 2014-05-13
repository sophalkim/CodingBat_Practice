
public class SeeColor {

	public static String seeColor(String str) {
		int len = str.length();
		if (len < 3) {
			return "";
		}
		if (len > 3 && str.substring(0, 4).equals("blue")) {
			return "blue";
		}
		if (len > 2 && str.substring(0, 3).equals("red")) {
			return "red";
		}
		return "";
	}
	
	
	public static void main(String[] args) {
		String str = "redxx";
		System.out.println(seeColor(str));
	}
}
