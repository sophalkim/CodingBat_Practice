
public class ArrayFront9 {

	public static boolean arrayFront9(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			if (nums[i] == 9 && i <= 3) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 9, 3, 4};
		System.out.println(arrayFront9(nums));
	}
}
