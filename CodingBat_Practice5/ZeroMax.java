public int[] zeroMax(int[] nums) {
	int max = 0;
	for (int i = 0; i < nums.length - 1; i++) {
		if (nums[i] == 0) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] % 2 != 0) {
					max = Math.max(max, nums[j]);
				}
			}
			nums[i] = max;
			max = 0;
		}
	}
	return nums;
}