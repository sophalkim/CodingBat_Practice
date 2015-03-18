public int countHi2(String str) {
	int count = 0;
	int len = str.length();
	if (len <= 1) return count;
	if (len >= 3 && str.charAt(0) == 'x' && str.substring(1, 3).equals("hi")) {
		return countHi2(str.substring(3));
	} else {
		if (str.substring(0, 2).equals("hi")) count++;
	}
	return count + countHi2(str.substring(1));
}