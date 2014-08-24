
public class Sum67 {

	public static int sum67(int[] nums) {
		int sum = 0;
		boolean resume = true;
		for (int i = 0; i < nums.length; i++) {
			if (resume) {
				if (nums[i] == 6) {
					resume = false;
				} else {
					sum += nums[i];
				}
			} else {
				if (nums[i] == 7) {
					resume = true;
				} else {
					continue;
				}
			}
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 2, 6, 99, 99, 7};
		System.out.println(sum67(nums));
	}
}
