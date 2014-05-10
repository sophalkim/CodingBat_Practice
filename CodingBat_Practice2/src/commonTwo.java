
public class commonTwo {
	public static void main(String[] args) {
		String[] a = {"a", "a", "b", "b", "c"};
		String[] b = {"a", "b", "b", "b", "c"};
		
		int count = 0;
		int x = a.length;
		int y = b.length;
		for (int i=0; i<x; i++) {
			if (i+1<x && a[i].equals(a[i+1])) continue;
			for (int j=0; j<y; j++) {
				if (a[i].equals(b[j])) {
					count++;
					break;
				}
			}
		}
		System.out.print(count);
	}
}
