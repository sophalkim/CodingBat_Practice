
public class sumNum2 {
	public static void main(String[] args) {
		String str = "aa11b33";
		int sum = 0;
		String x = "";
		for (int i=0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				x = "" + str.charAt(i);
				i++;
				for (int j=i; j<str.length(); j++) {
					if (j<str.length() && Character.isDigit(str.charAt(j))) {
						x = x + "" + str.charAt(j);
						i = j;
					} else {
						break;
					}
				}
				sum = sum + Integer.parseInt(x);
			}
		}
		System.out.print(sum);
	}
}
