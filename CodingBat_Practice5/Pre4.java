public int[] pre4(int[] nums) {
	int four = 0;
	int len = nums.length;
	for (int i = 0; i < len; i++) {
		if (nums[i] == 4) {
			four = i;
			break;
		}
	}
	int[] x = new int[four];
	for (int i = 0; i < four; i++) {
		x[i] = nums[i];
	}
	return x;
}