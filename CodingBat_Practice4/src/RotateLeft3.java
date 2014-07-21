
public class RotateLeft3 {

	public static int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {5, 11, 9};
		System.out.println(rotateLeft3(nums));
	}
}
