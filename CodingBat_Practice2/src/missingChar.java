
public class missingChar {
	public static void main(String[] args) {
		String str = "kitten";
		int n = 1;
		String x = str.substring(0,n) + str.substring(n+1);
		System.out.println(x);
	}
}
