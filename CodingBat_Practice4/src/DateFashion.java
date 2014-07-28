
public class DateFashion {

	public static int dateFashion(int you, int date) {
		if (you <= 2 || date <= 2) {
			return 0;
		}
		if (you >= 8 || date >= 8) {
			return 2;
		}
		return 1;
	}
	
	
	public static void main(String[] args) {
		int you = 5;
		int date = 10;
		System.out.println(dateFashion(you, date));
	}
}
