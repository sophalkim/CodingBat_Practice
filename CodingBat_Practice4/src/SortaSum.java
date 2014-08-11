
public class SortaSum {

	public static int sortaSum(int a, int b) {
		int sum = a + b;
		if (sum >= 10 && sum <= 19) {
			return 20;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int a = 9;
		int b = 4;
		System.out.println(sortaSum(a, b));
	}
}
