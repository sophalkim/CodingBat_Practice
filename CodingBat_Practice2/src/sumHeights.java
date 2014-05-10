
public class sumHeights {
	public static void main(String[] args) {
		int[] heights = {5, 3, 6, 7, 2};
		int start = 0;
		int end = 4;
		int sum = 0;
		for (int i=start; i<end; i++) {
			sum = sum + Math.abs(heights[i]-heights[i+1]);
		}
		System.out.print(sum);
	}
}
