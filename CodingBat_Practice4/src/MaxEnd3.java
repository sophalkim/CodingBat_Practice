
public class MaxEnd3 {

	public static int[] maxEnd3(int[] nums) {
		if (nums[0] > nums[2]) {
			nums[1] = nums[0];
			nums[2] = nums[0];
		} else {
			nums[1] = nums[2];
			nums[0] = nums[2];
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(maxEnd3(nums));
	}
}
