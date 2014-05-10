
public class stringYak {
	public static void main(String[] args) {
		String str = "yakpak";
		String x = "";
		for (int i=0; i<str.length(); i++) {
			if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
				i=i+2;
			} else {
				x = x + str.charAt(i);
			}
		}
		System.out.println(x);
	}
}
