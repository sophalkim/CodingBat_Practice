
public class Array123 {

	public static boolean array123(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 1, 2, 4, 1};
		System.out.println(array123(nums));
	}
}
