public boolean has271(int[] nums) {
	int len = nums.length;
	for (int i = 0; i < len - 2; i++) {
		if (nums[i] + 5 == nums[i + 1] && Math.abs((nums[i] - 1) - nums[i + 2]) <= 2) {
			return true;
		}
	}
	return false;
}