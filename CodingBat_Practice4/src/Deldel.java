
public class Deldel {

	public static String delDel(String str) {
		int len = str.length();
		if (len < 4) {
			return str;
		}
		if (str.substring(1, 4).equals("del")) {
			return str.substring(0, 1) + str.substring(4);
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		String str = "adelbc";
		System.out.println(delDel(str));
	}
}
