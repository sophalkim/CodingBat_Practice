public int[] withoutTen(int[] nums) {
	int len = nums.length;
	int ten = 0;
	for (int i = 0; i < len; i++) {
		if (nums[i] == 10) {
			nums[i] = 0;
			ten++;
		}
	}
	int[] x = new int[len];
	int index = 0;
	for (int i = 0; i < len; i++) {
		if (nums[i] != 0) {
			x[index] = nums[i];
			index++;
		}
	}
	return x;
}