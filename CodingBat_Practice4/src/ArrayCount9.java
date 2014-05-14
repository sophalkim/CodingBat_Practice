
public class ArrayCount9 {

	public static int arrayCount9(int[] nums) {
		int len = nums.length;
		int count = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 9) {
				count++;
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 9, 9, 3, 9};
		System.out.println(arrayCount9(nums));
	}
}
