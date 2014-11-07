public int[] frontPiece(int[] nums) {
	if (nums.length <= 2) {
		return nums;
	}
	int[] x = new int[2];
	x[0] = nums[0];
	x[1] = nums[1];
	return x;
}