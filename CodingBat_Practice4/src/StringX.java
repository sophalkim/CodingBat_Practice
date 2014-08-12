
public class StringX {

	public static String stringX(String str) {
		String x = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'x') x += str.charAt(i);
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		String str = "xabxxxcdx";
		System.out.println(stringX(str));
	}
}
