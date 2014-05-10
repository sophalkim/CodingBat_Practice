package Practice3;

public class MaxMirror {

	public static int maxMirror(int[] nums) {
		int count = 0;
		int index = 0;
		int len = nums.length;
		if (len == 1) {
			count = 1;
		}
		for (int i = 1; i <= len; i++) {
			// Triple Loop
			for (int j = 0; j < len; j++) {
				int[] x = new int[i];
				int indexX = 0;
				for (int k = j; k < i; k++) {
					x[indexX] = nums[k];
					indexX++;
//					System.out.print(x[indexX - 1] + ",");
				}
				// testing loop
				for (int m = len - 1; m >= 0; m--) {
					if (index == i) {
						count = i;
						index = 0;
					}
					if (x[index] == nums[m]) {
						index++;
					} else {
						count = Math.max(count, index);
						index = 0;
					}
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {7, 1, 2, 9, 7, 2, 1};
		System.out.println(maxMirror(nums));
	}
	
//	// New Array Starting at Element 0 or x[0];
//				int[] x = new int[i];
//				for (int k = 0; k < i; k++) {
//					x[k] = nums[k];
////					System.out.print(x[k] + ", ");
//				}
//				// New Array Starting at Element 1 or x[1];
//				int[] y = new int[i];
//				int indexY = 0;
//				for (int m = 1; m < i; m++) {
//					y[indexY] = nums[m];
//					indexY++;
////					System.out.print(y[m - 1] + ",");
//				}
}
