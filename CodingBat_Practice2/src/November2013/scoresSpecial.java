package November2013;

public class scoresSpecial {

	public static int scoresSpecial(int[] a, int[] b) {
		  return largest(a) + largest(b);
	}
	
	public static int largest(int[] x) {
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] % 10 == 0) {
				max = Math.max(max, x[i]);
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		
		int[] a = {12, 11, 4};
		int[] b = {2, 20, 31};
		System.out.println(scoresSpecial(a, b));
	}
}
