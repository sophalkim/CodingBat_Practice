
public class StringBits {

	public static String stringBits(String str) {
		int len = str.length();
		String x = "";
		for (int i = 0; i < len; i+=2) {
			x+= str.charAt(i);
		}
		return x;	
	}
	
	
	public static void main(String[] args) {
		String str = "Heeololeo";
		System.out.println(stringBits(str));
	}
}
