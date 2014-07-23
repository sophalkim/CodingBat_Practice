
public class Last2 {

	public static int last2(String str) {
		int len = str.length();
		if (len <= 2) {
			return 0;
		}
		String x = str.substring(len - 2, len);
		int count = 0;
		for (int i = 0; i < len - 2; i++) {
			if (str.substring(i, i + 2).equals(x)) count++;
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		String str = "axxxaaxx";
		System.out.println(last2(str));
	}
}
