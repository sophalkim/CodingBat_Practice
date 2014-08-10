
public class CaughtSpeeding {

	public static int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday) {
			if (speed <= 65) {
				return 0;
			}
			if (speed <= 85) {
				return 1;
			} else {
				return 2;
			}
		}
		if (speed <= 60) {
			return 0;
		}
		if (speed <= 80) {
			return 1;
		} else {
			return 2;
		}
	}
	
	
	public static void main(String[] args) {
		int speed = 65;
		boolean isBirthday = false;
		System.out.println(caughtSpeeding(speed, isBirthday));
	}
}
