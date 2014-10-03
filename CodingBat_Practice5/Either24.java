public boolean either24(int[] nums) {
	boolean x = false;
	for (int i = 0; i < nums.length - 1; i++) {
		if (nums[i] == 2 && nums[i + 1] == 2) {
			x = !x;
		}
		if (nums[i] == 4 && nums[i + 1] == 4) {
			x = !x;
		}
	}
	return x;
}