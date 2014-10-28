public boolean has12(int[] nums) {
	for (int i = nums.length - 1; i > 0; i--) {
		if (nums[i] == 1) return false;
		if (nums[i] == 2) return true;
	}
return false;
} 