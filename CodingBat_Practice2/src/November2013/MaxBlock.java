package November2013;

public class MaxBlock {

	public static int maxBlock(String str) {
		int big = 1;
		int count = 1;
		int len = str.length();
		if (len < 1) {
			return 0;
		}
		for (int i = 0; i < len - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count = 2;
				for (int j = i + 1; j < len - 1; j++) {
					if (str.charAt(i) == str.charAt(j + 1)) {
						count++;
					} else {
						break;
					}
				}
				big = Math.max(big, count);
			}
		}
		return big;
	}
	
	
	public static void main(String[] args) {
		
		String str = "abbCCCddBBBxx";
		System.out.println(maxBlock(str));
	}
}
