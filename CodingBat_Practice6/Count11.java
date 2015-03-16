public int count11(String str) {
	int len = str.length();
	int count = 0;
	if (len <= 1) return count;
	if (str.substring(0, 2).equals("11")) {
		count++;
		return count + count11(str.substring(2));
	}
	return count + count11(str.substring(1));
}