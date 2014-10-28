public int[] post4(int[] nums) {
	int fourIndex = 0;
	int len = nums.length;
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 4) {
			fourIndex = i;
		}
	}
	int[] x = new int[len - fourIndex - 1];
	int count = 0;
	for (int i = fourIndex + 1; i < len; i++) {
		x[count] = nums[i];
		count++;
	}
	return x;
}