
public class Reverse3 {

	public static int[] reverse3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[2];
		nums[2] = temp;
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {5, 11, 9};
		System.out.println(reverse3(nums));
	}
}
