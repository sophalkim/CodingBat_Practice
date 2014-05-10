package November2013;

public class someHeight {

	public static int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum = sum + Math.abs(Math.abs(heights[i] - heights[i + 1]));
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] heights = {5, 3, 6, 7, 2};
		int start = 0;
		int end = 4;
		System.out.println(sumHeights(heights, start, end));
	}
}
