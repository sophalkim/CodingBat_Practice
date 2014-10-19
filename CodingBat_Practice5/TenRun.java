public int[] tenRun(int[] nums) {
	int tenMultiple = 0;
	boolean startMultiple = false;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] % 10 == 0) {
			tenMultiple = nums[i];
			startMultiple = true;
			continue;
		}
		if (startMultiple) {
			nums[i] = tenMultiple;
		}
	}
	return nums;
}