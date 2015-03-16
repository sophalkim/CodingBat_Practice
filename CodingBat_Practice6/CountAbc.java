public int countAbc(String str) {
	String a = "abc";
	String b = "aba";
	int count = 0;
	int len = str.length();
	if (len <= 2) return count;
	if (str.substring(0, 3).equals(a) || str.substring(0, 3).equals(b)) count++;
	return count + countAbc(str.substring(1));
}