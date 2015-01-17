public String middleThree(String str) {
	int len = str.length();
	int middle = (len / 2) - 1;
	if (len <= 3) {
		return str;
	}
	return str.substring(middle, middle + 3);
}