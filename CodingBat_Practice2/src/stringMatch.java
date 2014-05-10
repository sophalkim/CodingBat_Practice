
public class stringMatch {
	public static void main(String[] args) {
		String a = "xxcaazz";
		String b = "xxbaaz";
		int count = 0;
		int x = a.length();
		int y = b.length();
		int z = Math.min(x, y);
		for (int i=0; i<z-1; i++) {
			if (a.substring(i, i+2).equals(b.substring(i,i+2))) count++;
		}
		System.out.println(count);
	}
}
