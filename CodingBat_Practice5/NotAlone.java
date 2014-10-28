public int[] notAlone(int[] nums, int val) {
	boolean alone = false;
	int len = nums.length;
	for (int i = 0; i < len; i++) {
		if (nums[i] == val && i != 0 && i < len - 1 && nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
			alone = true;
		}
		if (alone) {
			nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			alone = false;
		}
	}
	return nums;
}