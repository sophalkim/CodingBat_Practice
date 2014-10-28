public boolean sameEnds(int[] nums, int len) {
	int x = nums.length - len;
	for (int i = 0; i < len; i ++) {
		if (nums[i] != nums[x]) {
			return false;
		}
		x += 1;
	}
	return true;
}