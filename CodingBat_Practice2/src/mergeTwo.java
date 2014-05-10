import java.util.Set;
import java.util.TreeSet;

public class mergeTwo {
	public static void main(String[] args) {
		String[] a = {"a", "c", "z"};
		String[] b = {"b", "f", "z"};
		int n = 3;
		Set<String> list = new TreeSet<String>();
		for (int i=0; i<n; i++) {
			list.add(a[i]);
			list.add(b[i]);
		}
		String[] x = list.toArray(new String[n]);
		for (int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}
		String[] y = new String[n];
		for (int i=0; i<n; i++) {
			y[i] = x[i];
		}
		for (int i=0; i<y.length; i++) {
			System.out.println(y[i]);
		}
	}
}
