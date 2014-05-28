
public class SameFirstLast {

	public static boolean sameFirstLast(int[] nums) {
		int len = nums.length;
		if (len < 1) {
			return false;
		}
		if (nums[0] == nums[len - 1]) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(sameFirstLast(nums));
	}
}
