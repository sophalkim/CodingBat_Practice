public int[] midThree(int[] nums) {
	int[] x = new int[3];
	int len = nums.length;
	int middle = (len / 2) - 1;
	int index = 0;
	for (int i = middle; i < middle + 3; i++) {
		x[index] = nums[i];
		index++;
	}
	return x;
}