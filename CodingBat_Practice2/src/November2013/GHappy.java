package November2013;

public class GHappy {

	public static boolean gHappy(String str) {
		if (str.length() < 2) {
			return false;
		}
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals("g")) {
				if (i == 0 && !str.substring(i + 1, i + 2).equals("g")) {
					return false;
				}
				if (i == str.length() - 1 && !str.substring(i - 1, i).equals("g")) {
					return false;
				}
				if (i != 0 && i != str.length() - 1 && !str.substring(i - 1, i).equals("g") && !str.substring(i + 1, i + 2).equals("g")) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "xxggyygxx";
		System.out.println(gHappy(str));
	}
}
