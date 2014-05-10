
public class Sorting2 {
	
	public static int[] descendingsort(int[] x) {
		int len = x.length;
		int temp = 0;
		for (int i=0; i<len; i++) {
			for (int j=i; j<len; j++) {
				temp = x[i];
				if (x[i]>x[j]) {
					x[i]=x[j];
					x[j]=temp;
				}
			}
		}
		return x;
	}
	public static void main(String[] args) {
		int[] some_numbers = {4,5,8,2,55,8,3,6,9,1};
		int[] z = descendingsort(some_numbers);
		for (int i=0; i<some_numbers.length; i++) {
			System.out.println(z[i]);
		}
	}
}
