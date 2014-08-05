
public class SquirrelPlay {

	public static boolean squirrelPlay(int temp, boolean isSummer) {
		if (isSummer && temp >= 60 && temp <= 100) {
			return true;
		}
		if (temp >= 60 && temp <= 90) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int temp = 70;
		boolean isSummer = false;
		System.out.println(squirrelPlay(temp, isSummer));
	}
}
