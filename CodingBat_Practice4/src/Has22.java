
public class Has22 {

	public static boolean has22(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 1, 2};
		System.out.println(has22(nums));
	}
}
