public boolean array6(int[] nums, int index) {
	int len = nums.length;
	if (len <= 0) return false;
	if (nums[0] == 6) return true;
	return array6(popFirst(nums), 0);
}

public int[] popFirst(int[] array) {
	int[] result = new int[array.length - 1];
	int index = 0;
	for (int i = 0; i < array.length - 1; i++) {
		result[index] = array[i + 1];
		index++;
	}
	return result;
}