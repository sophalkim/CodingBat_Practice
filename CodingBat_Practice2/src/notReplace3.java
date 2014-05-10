
public class notReplace3 {
	public static void main(String[] args) {
		String str = "This is isabell";
		String x = "";
		int i = 0;
		while (i<str.length()) {
			if (i==0 && str.substring(i, i+2).equals("is") || i+1<str.length() && str.substring(i, i+2).equals("is") && (!Character.isLetter(str.charAt(i-1)) || !Character.isLetter(str.charAt(i+1)))) {
				x = x + "is not";
				i = i + 1;
			} else {
				x = x + str.substring(i, i+1);
			}
			i++;
		}
		System.out.println(x);
	}
}
