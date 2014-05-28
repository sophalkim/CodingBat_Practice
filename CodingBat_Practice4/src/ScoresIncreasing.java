
public class ScoresIncreasing {

	public static boolean scoresIncreasing(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		int[] nums = {1, 3, 4};
		System.out.println(scoresIncreasing(nums));
	}
}
