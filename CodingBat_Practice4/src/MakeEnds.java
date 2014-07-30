
public class MakeEnds {

	public static int[] makeEnds(int[] nums) {
		int[] x = new int[2];
		x[0] = nums[0];
		x[1] = nums[nums.length - 1];
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		System.out.println(makeEnds(nums));
	}
}
