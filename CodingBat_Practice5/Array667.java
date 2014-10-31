public int array667(int[] nums) {
	int len = nums.length;
	int count = 0;
	for (int i = 0; i < len - 1; i++) {
		if (nums[i] == 6) {
			if (nums[i+1] == 6 || nums[i+1] == 7) {
				count++;
			}
		}
	}
	return count;
}