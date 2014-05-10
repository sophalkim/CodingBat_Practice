package Practice3;

public class SeriesUp {

	public static int[] seriesUp(int n) {
		int[] x = new int[n * (n + 1) / 2];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				x[index] = j;
				index++;
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int n = 3;
		for (int i = 0; i < n * (n + 1) / 2; i++) {
		  System.out.print(seriesUp(n)[i] + ", ");
		}
	}
}
