public boolean twoTwo(int[] nums) {
	int len = nums.length;
	for (int i = 0; i < len; i++) {
		if (nums[i] == 2) {
			if (i == len - 1 && nums[i - 1] != 2) {
				return false;
			}
			if (i + 1 < len && nums[i + 1] != 2) {
				return false;
			} else {
				i++;
				continue;
			}
		}
	}
	return true;
}