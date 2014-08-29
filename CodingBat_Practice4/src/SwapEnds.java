
public class SwapEnds {

	public static int[] swapEnds(int[] nums) {
		int len = nums.length - 1;
		int temp = nums[0];
		nums[0] = nums[len];
		nums[len] = temp;
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {8, 6, 7, 9, 5};
		System.out.println(swapEnds(nums));
	}
}
