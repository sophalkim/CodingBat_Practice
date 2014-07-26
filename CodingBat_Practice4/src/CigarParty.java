
public class CigarParty {

	public static boolean cigarParty(int cigars, boolean isWeekend) {
		if (isWeekend && cigars >= 40) {
			return true;
		}
		if (cigars >= 40 && cigars <= 60) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int cigars = 30;
		boolean isWeekend = false;
		System.out.println(cigarParty(cigars, isWeekend));
	}
}
