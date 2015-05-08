public boolean firstLast6(int[] nums) {
	int last = nums.length - 1;
	return (nums[0] == 6 || nums[last] == 6);
}