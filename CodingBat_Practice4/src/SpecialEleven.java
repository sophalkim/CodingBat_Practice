
public class SpecialEleven {

	public static boolean specialEleven(int n) {
		int remainder = n % 11;
		if (remainder == 0 || remainder == 1) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int n = 23;
		System.out.println(specialEleven(n));
	}
}
