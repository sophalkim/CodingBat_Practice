
public class Double23 {

	public static boolean double23(int[] nums) {
		if (nums.length < 2) {
			return false;
		}
		boolean x = (nums[0] == 2 && nums[1] == 2);
		boolean y = (nums[0] == 3 && nums[1] == 3);
		if (x || y) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {2, 2};
		System.out.println(double23(nums));
	}
}
