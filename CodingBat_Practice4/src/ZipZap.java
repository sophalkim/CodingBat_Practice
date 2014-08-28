
public class ZipZap {

	public static String zipZap(String str) {
		String x = "";
		int len = str.length();
		for (int i = 0; i < len; i++) {
			if (i + 2 < len && str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				x += "zp";
				i+=2;
			} else {
				x += str.charAt(i);
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "zzzopzop";
		System.out.println(zipZap(str));
	}
}
