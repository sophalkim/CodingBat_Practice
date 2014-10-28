public int[] evenOdd(int[] nums) {
	int len = nums.length;
	int[] x = new int[len];
	int index = 0;
	for (int i = 0; i < len; i++) {
		if (nums[i] % 2 == 0) {
			x[index] = nums[i];
			index++;
		}
	}
	for (int i = 0; i < len; i++) {
		if (nums[i] % 2 != 0) {
			x[index] = nums[i];
			index++;
		}
	}
	return x;
}