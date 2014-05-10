
public class sumNumber {
	public static void main(String[] args) {
		String str = "aa11b33";
		int sum = 0;
		for (int i=0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				for (int j=i; j<str.length(); j++) {
					if (Character.isDigit(str.charAt(j+1))) {
					} else {
						sum = sum + Integer.parseInt(str.substring(i, j));
						i=j;
					}
				}
			}
		}
		System.out.println(sum);
	}
}
