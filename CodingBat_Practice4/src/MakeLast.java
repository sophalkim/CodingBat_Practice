
public class MakeLast {

	public static int[] makeLast(int[] nums) {
		int[] x = new int[nums.length * 2];
		x[x.length - 1] = nums[nums.length - 1];
		return x;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {4, 5, 6};
		System.out.println(makeLast(nums));
	}
}
