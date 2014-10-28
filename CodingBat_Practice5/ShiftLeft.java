public int[] shiftLeft(int[] nums) {
	int len = nums.length;
	if (len <= 0) {
		return nums;
	}
	int temp = nums[0];
	for (int i = 0; i < len - 1; i++) {
		nums[i] = nums[i + 1];
	}
	nums[len - 1] = temp;
	return nums;
}