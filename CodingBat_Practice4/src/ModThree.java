
public class ModThree {

	public static boolean modThree(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
				return true;
			}
			if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 1, 3, 5};
		System.out.println(modThree(nums));
	}
}
