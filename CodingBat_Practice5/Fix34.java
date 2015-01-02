public int[] fix34(int[] nums) {
	int len = nums.length;
	int temp = 0;
	int index = 0;
	for (int i = 0; i < len; i++) {
		if (nums[i] == 3) {
			temp = nums[i + 1];
			for (int j = index; j < len; j++) {
				if (nums[j] == 4) {
					nums[i + 1] = 4;
					nums[j] = temp;
					index = j + 1;
					break;
				}
			}
		}
	}
	return nums;
}