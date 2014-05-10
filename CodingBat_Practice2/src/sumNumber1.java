
public class sumNumber1 {
	public static void main(String[] args) {
		String str = "7 11";
		int sum = 0;
		String num = "";
		
		for (int i=0; i<str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				num = "" + str.charAt(i);
				i++;
				while (i<str.length() && Character.isDigit(str.charAt(i))) {
					num = num + "" + str.charAt(i);
					i++;
				}
				sum = sum + Integer.parseInt(num);
			}
		}
		System.out.print(sum);
	}
}
