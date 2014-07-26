
public class Sum2 {

	public static int sum2(int[] nums) {
		int len = nums.length;
		if (len >= 2) {
			len = 2;
		}
		int sum = 0;
		for (int i = 0; i < len; i++) {
			sum += nums[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(sum2(nums));
	}
}
