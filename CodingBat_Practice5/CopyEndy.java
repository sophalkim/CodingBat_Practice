public int[] copyEndy(int[] nums, int count) {
	int[] x = new int[count];
	int index = 0;
	for (int i = 0; i < nums.length; i++) {
		if (isEndy(nums[i]) && index < count) {
			x[index] = nums[i];
			index++;
		}
	}
	return x;
}

public boolean isEndy(int n) {
	if ((n >= 0 && n <= 10) || (n >=90 && n <= 100)) {
		return true;
	}
	return false;
}