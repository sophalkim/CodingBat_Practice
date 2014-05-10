
public class stringX {
	public static void main(String[] args) {
		String str = "xxHxix";
		String x = "";
		for (int i=1; i<str.length()-1; i++) {
			if (str.charAt(i)!='x') {
				x = x + str.charAt(i);
			}
		}
		System.out.println(str.charAt(0)+ x + str.charAt(str.length()-1));
	}
}
