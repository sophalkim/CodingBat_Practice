
public class FizzBuzz {
	public static void main(String[] args) {
		int start = 1;
		int end = 15;
		int y = end-start;
		String[] x = new String[y];
		for (int i=0; i<y; i++) {
			x[i] = String.valueOf(i+start);
		}
		for (int i=0; i<y; i++) {
			if (Integer.parseInt(x[i])%3==0 && Integer.parseInt(x[i])%5==0) {
				x[i] = "FizzBuzz";
				continue;
			}
			if (Integer.parseInt(x[i])%3==0) {
				x[i] = "Fizz";
				continue;
			}
			if (Integer.parseInt(x[i])%5==0) {
				x[i] = "Buzz";
				continue;
			}
		}
		for (int i=0; i<y; i++) {
			System.out.println(x[i]);
		}
	}
}
