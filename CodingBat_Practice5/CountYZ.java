public int countYZ(String str) {
	int count = 0;
	int len = str.length();
	String m = str.toLowerCase();
	for (int i = 0; i < len; i++) {
		char x = m.charAt(i);
		if (x == 'y' || x == 'z') {
			if (i == len - 1) count++;
			if (i + 1 < len && !Character.isLetter((m.charAt(i + 1)))) count++;
		}
	}
	return count;
}