
public class AlarmClock {

	public static String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6) {
				return "off";
			} else {
				return "10:00";
			}
		}
		if (day == 0 || day == 6) {
			return "10:00";
		} else {
			return "7:00";
		}
	}
	
	
	public static void main(String[] args) {
		int day = 5;
		boolean vacation = false;
		System.out.println(alarmClock(day, vacation));
	}
}
