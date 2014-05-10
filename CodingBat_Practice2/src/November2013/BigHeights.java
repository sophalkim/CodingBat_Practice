package November2013;

public class BigHeights {

	public static int bigHeights(int[] heights, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				sum++;
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int[] heights = {5, 3, 6, 7, 2};
		int start = 2;
		int end = 4;
		System.out.println(bigHeights(heights, start, end));
	}
}
