
public class Sum3 {

	public static int sum3(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {5, 11, 2};
		System.out.println(sum3(nums));
	}
}
