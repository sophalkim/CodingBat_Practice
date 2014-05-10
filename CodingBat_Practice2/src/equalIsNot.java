
public class equalIsNot {
	public static void main(String[] args) {
		String str = "This is notnot";
		int x = 0;
		int y = 0;
		for (int i=0; i<str.length()-1; i++) {
			if (str.substring(i, i+2).equals("is")) x++;
		}
		for (int i=0; i<str.length()-2; i++) {
			if (str.substring(i, i+3).equals("not")) y++;
		}
	}
}
