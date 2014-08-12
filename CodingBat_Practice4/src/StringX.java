
public class StringX {

	public static String stringX(String str) {
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			if (i == 0 && str.charAt(0) == 'x' || i == str.length() - 1 
					&& str.charAt(str.length() - 1) == 'x') {
				x += str.charAt(i);
			}
			if (str.charAt(i) != 'x') x += str.charAt(i);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "xabxxxcdx";
		System.out.println(stringX(str));
	}
}
