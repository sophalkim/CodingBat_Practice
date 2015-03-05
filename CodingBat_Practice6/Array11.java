public int array11(int[] nums, int index) {
	int count = 0;
	int len = nums.length;
	if (len <= 0) return count;
	if (nums[0] == 11) count++;
	return count + array11(popFirst(nums), index);
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