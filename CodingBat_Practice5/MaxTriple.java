public int maxTriple(int[] nums) {
	int max = 0;
	int len = nums.length;
	int last = len - 1;
	int middle = (len / 2);
	if (len <= 1) {
		return nums[0];
	}
	return Math.max(nums[0], Math.max(nums[middle], nums[last]));
}