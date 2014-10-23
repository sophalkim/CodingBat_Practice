public int[] zeroFront(int[] nums) {
	int zeros = 0;
	int len = nums.length;
	for (int i = 0; i < len; i++) {
		if (nums[i] == 0) {
			zeros++;
		}
	}
	int[] x = new int[len];
	for (int i = 0; i < zeros; i++) {
		x[i] = 0;
	}
	int index = zeros;
	for (int i = 0; i < len; i++) {
		if (nums[i] != 0) {
			x[index] = nums[i];
			index++;
		}
	}
	return x;
}