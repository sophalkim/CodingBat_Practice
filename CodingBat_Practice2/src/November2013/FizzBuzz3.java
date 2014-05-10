package November2013;

public class FizzBuzz3 {

	public static String[] FizzBuzz(int start, int end) {
			int[] x = new int[end - start];
			for (int i = 0; i < x.length; i++) {
				x[i] = start + i;
			}
			String[] y = new String[x.length];
			for (int i = 0; i < x.length; i++) {
				if (x[i] % 3 == 0 && x[i] % 5 == 0) {
					y[i] = "FizzBuzz";
					continue;
				}
				if (x[i] % 3 == 0) {
					y[i] = "Fizz";
					continue;
				}
				if (x[i] % 5 == 0) {
					y[i] = "Buzz";
					continue;
				}
				y[i] = x[i] + "";
			}
			return y;
		}
	
	
	public static void main(String[] args) {
		
		int start = 1;
		int end = 16;
		for (int i = 0; i < end - start; i++) {
			System.out.println(FizzBuzz(start,end)[i]);
		}
	}
}
