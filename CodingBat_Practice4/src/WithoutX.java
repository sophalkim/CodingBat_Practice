
public class WithoutX {

	public static String withoutX(String str) {
		int len = str.length();
		String x = "";
		for (int i = 0; i < len; i++) {
			if (str.substring(i, i + 1).equals("x")) {
				if (i != 0 && i != len - 1) {
					x += str.substring(i, i + 1);
				}
			} else {
				x += str.substring(i, i + 1);
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "Hxix";
		System.out.println(withoutX(str));
	}
}
