
public class NearTen {

	public static boolean nearTen(int num) {
		return (num % 10 >= 8 || num % 10 <= 2);
	}
	
	
	public static void main(String[] args) {
		int num = 17;
		System.out.println(nearTen(num));
	}
}
