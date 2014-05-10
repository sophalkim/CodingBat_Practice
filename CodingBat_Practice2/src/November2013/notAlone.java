package November2013;

public class notAlone {

	public static int[] notAlone(int[] nums, int val) {
		int len = nums.length;
		if (len < 3) {
			return nums;
		}
		for (int i = 1; i < len - 1; i++) {
			if (nums[i] == val && nums[i - 1] != nums[i + 1]) {
				if (nums[i - 1] == nums[i + 1]) {
					continue;
				}
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
		return nums;
	}
	
	
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3, 2, 5, 2};
		int val = 2;
		System.out.println(notAlone(nums, val));
	}
}
