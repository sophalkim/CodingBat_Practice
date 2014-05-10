package November2013;

public class getSandwich {
	
	public static String getSandwich(String str) {
		String x = "bread";
		String z = "";
		int firstBread = 0;
		int lastBread = 0;
		int len = str.length() - 4;
		if (str.length() < 10) {
			return z;
		}
		for (int i = 0; i < len; i++) {
			String y = str.substring(i, i + 5);
			if (y.equals(x)) {
				firstBread = i + 5;
				for (int j = len - 1; j > 0; j--) {
					String w = str.substring(j, j + 5);
					if (w.equals(x)) {
						lastBread = j;
						break;
					}
				}
				break;
			}
		}
		z = str.substring(firstBread, lastBread);
		return z;
	}
	
	public static void main(String[] args) {
	
		String str = "breadbreadbreadbread";
		System.out.println(getSandwich(str));
	}
}
