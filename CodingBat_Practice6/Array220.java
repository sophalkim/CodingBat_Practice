public boolean array220(int[] nums, int index) {
	int len = nums.length;
	if (len <= 1) return false;
	if (nums[0] * 10 == nums[1]) return true;
	return array220(popFirst(nums), index);
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