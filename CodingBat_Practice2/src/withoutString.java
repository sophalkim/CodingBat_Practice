
public class withoutString {
	public static void main(String[] args) {
		String base = "Hello there";
		String remove = "llo";
		String x = "";
		int y = base.length();
		int z = remove.length();
		for (int i=0; i<y; i++) {
			if (i+z-1<y && base.substring(i, i+z).equals(remove) || i+z-1<y && base.substring(i, i+z).equals(remove.toLowerCase()) || i+z-1<y && base.substring(i, i+z).equals(remove.toUpperCase())) {
				i=i+z-1;
			} else {
				x = x + base.substring(i,i+1);
			}
		}
		System.out.println(x);
	}
}
