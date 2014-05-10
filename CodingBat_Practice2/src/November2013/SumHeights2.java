package November2013;

public class SumHeights2 {

	public static int sumHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (heights[i] - heights[i + 1] < 0) {
				sum = sum + Math.abs(Math.abs(2 * (heights[i] - heights[i +1])));
			} else {
				sum = sum + Math.abs(Math.abs(heights[i] - heights[i + 1]));
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] heights = {5, 3, 6, 7, 2};
		int start = 2;
		int end = 4;
		System.out.println(sumHeights(heights, start, end));
	}
}
