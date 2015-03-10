public int countPairs(String str) {
	int count = 0;
	int len = str.length();
	if (len <= 2) return count;
	if (str.charAt(0) == str.charAt(2)) count++;
	return count + countPairs(str.substring(1));
}