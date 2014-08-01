
public class Has23 {

	public static boolean has23(int[] nums) {
		boolean x = nums[0] == 2 || nums[0] == 3;
		boolean y = nums[1] == 2 || nums[1] == 3;
		if (x || y) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {4, 3};
		System.out.println(has23(nums));
	}
}
