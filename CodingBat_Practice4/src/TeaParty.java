
public class TeaParty {

	public static int teaParty(int tea, int candy) {
		if (tea >= 5 && candy >= 5) {
			if (tea>= candy * 2 || candy>= tea * 2) {
				return 2;
			} else {
				return 1;
			}
		}
		return 0;
	}
	
	
	public static void main(String[] args) {
		int tea = 20;
		int candy = 6;
		System.out.println(teaParty(tea, candy));
	}
}
