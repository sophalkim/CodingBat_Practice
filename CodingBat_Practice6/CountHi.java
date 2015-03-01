public int countHi(String str) {
	int count = 0;
	int len = str.length();
	if (len < 2) return count;
	if (len > 1 && str.substring(len - 2, len).equals("hi")) count++;
	return count + countHi(str.substring(0, len - 1));
}