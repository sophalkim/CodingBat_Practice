
public class Old35 {

	public static boolean old35(int n) {
		int three = n % 3;
		int five = n % 5;
		if (three == 0 && five == 0) {
			return false;
		}
		if (three == 0) {
			return true;
		}
		if (five == 0) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int n = 10;
		System.out.println(old35(n));
	}
}
