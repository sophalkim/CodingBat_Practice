package Practice3;

public class SquareUp {

	public static int[] squareUp(int n) {
		int[] x = new int[n * n];
		if (n == 0) {
			return x;
		}
		x[n * (n - 1)] = n;
		for (int i = 0; i < x.length; i+= n) {
			if (i % n == 0) {
				x[i + (n - 1)] = 1;
			}
			for (int j = 1; j < n; j++) {
				if (i >= n * j) {
					x[(i + (n - 1 - j))] = j + 1;
				}
			}
		}
		return x;
	}
	
	
	public static void main(String[] args) {
		int n = 6;
		for (int i = 0; i < n * n; i++) {
		  System.out.print(squareUp(n)[i] + ", ");
		}
	}
}
