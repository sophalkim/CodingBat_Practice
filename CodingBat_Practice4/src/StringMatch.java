
public class StringMatch {

	public static int stringMatch(String a, String b) {
		int count = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.substring(i, i +2).equals(b.substring(i, i + 2))) {
				count++;
			}
		}
		return count;	
	}
	
	
	public static void main(String[] args) {
		String a = "xxcaazz";
		String b = "xxbaaz";
		System.out.println(stringMatch(a, b));
	}
}
