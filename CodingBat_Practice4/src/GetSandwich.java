
public class GetSandwich {

	public static String getSandwich(String str) {
		int len = str.length();
		String b = "bread";
		int count = 0;
		for (int i = 0; i < len - 4; i++) {
			if (str.substring(i, i + 5).equals(b)) {
				count++;
			}
		}
		if (count <= 1) {
			return "";
		}
		int start = 0;
		for (int i = 0; i < len - 5; i++) {
			if (str.substring(i, i + 5).equals(b)) {
				start = i + 5;
				break;
			}
		}
		int end = len;
		for (int i = len; i >= 5; i--) {
			if (str.substring(i - 5, i).equals(b)) {
				end = i - 5;
				break;
			}
		}
		return str.substring(start, end);	
	}
	
	
	public static void main(String[] args) {
		String str = "breaxbreadybread";
		System.out.println(getSandwich(str));
	}
}
