package Recursion;

public class Triangle {

	public static int triangle(int rows) {
		if (rows == 0) {
			return 0;
		}
		if (rows == 1) {
			return 1;
		}
		return triangle(rows - 1) + rows;
	}
	
	// Factorial using compact recursion
	public static int fR(int x) {
		if (x == 1) {
			return 1;
		}
		return x * fR(x - 1);
	}
	
	
	public static void main(String[] args) {
		int x = 4;
		System.out.println(triangle(x));
	}
}
