public boolean gHappy(String str) {
	int len = str.length();
	for (int i = 0; i < len; i++) {
		if (str.substring(i, i + 1).equals("g")) {
			if (i != 0 && str.substring(i - 1, i).equals("g")) {
				continue;
			}
			if (i + 1 < len && str.substring(i + 1, i + 2).equals("g")) {
				continue;
			}
			return false;
		}
	}
	return true;
}