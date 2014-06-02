
public class XyBalance {

	public static boolean xyBalance(String str) {
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			String x = str.substring(i, i + 1);
			if (x.equals("y")) {
				return true;
			}
			if (x.equals("x")) {
				return false;
			}
		}
		return true;	
	}
	
	
	public static void main(String[] args) {
		String str = "yaaxbb";
		System.out.println(xyBalance(str));
	}
}
