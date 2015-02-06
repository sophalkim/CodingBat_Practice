
public class hashcode {
	
	public static void count(int n) {
		while (n > 0) {
			n = n / 10;
			System.out.print(n % 10);
		}
	}
	public static void main(String[] args) {
		count(12254);
	}
}
