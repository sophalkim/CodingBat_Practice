
public class hashcode {
	public static void main(String[] args) {
		int[] x = {1,2,4,6,8};
		int sum=0;
		for (int y: x) {
			sum = sum + y;
		}
		System.out.println(sum);
	}
}
