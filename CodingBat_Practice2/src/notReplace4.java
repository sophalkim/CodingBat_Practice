
public class notReplace4 {
	public static void main(String[] args) {
		String str = "This is isabell";
		String x = "";
		int y = str.length();
		int i = 0;
		while (i<y) {
			if (i+1<y && str.substring(i, i+2).equals("is")) {
				if (i>0 && i+2<str.length() && !Character.isLetter(str.charAt(i-1)) && !Character.isLetter(str.charAt(i+2))) {
					x = x + "is not";
					i = i + 2;
				} 
				if (i==0 && !Character.isLetter(str.charAt(i+2))) {
					x = x + "is not";
					i = i + 1;
				}
				if (i==str.length()-2 && !Character.isLetter(str.charAt(i-1))) {
					x = x + "is not";
					i = i + 2;
				}
			} else {
				x = x + str.substring(i, i+1);
				i++;
			}
		}
		System.out.println(x);
	}
}
