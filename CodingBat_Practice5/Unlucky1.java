public boolean unlucky1(int[] nums) {
	int len = nums.length;
	if (len <= 1) {
		return false;
	}
	if (nums[0] == 1 && nums[1] == 3) {
		return true;
	}
	if (nums[1] == 1 && nums[2] == 3) {
		return true;
	}
	if (nums[len - 2] == 1 && nums[len - 1] == 3) {
		return true;
	}
	return false;
}