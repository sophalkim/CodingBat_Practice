
public class No23 {

	public static boolean no23(int[] nums) {
		boolean x = nums[0] == 2 || nums[0] == 3;
		boolean y = nums[1] == 2 || nums[1] == 3;
		return (!x && !y);
	}
	
	
	public static void main(String[] args) {
		int[] nums = {4, 5};
		System.out.println(no23(nums));
	}
}
