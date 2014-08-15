
public class MakeMiddle {

	public static int[] makeMiddle(int[] nums) {
		int[] x = new int[2];
		int middle = (nums.length / 2) - 1;
		x[0] = nums[middle];
		x[1] = nums[middle + 1];
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {7, 1, 2, 3, 4, 9};
		System.out.println(makeMiddle(nums));
	}
}
