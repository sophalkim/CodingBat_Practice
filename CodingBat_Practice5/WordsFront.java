public String[] wordsFront(String[] words, int n) {
	int len = words.length;
	String[] x = new String[n];
	int index = 0;
	for (int i = 0; i < n; i++) {
		x[index] = words[i];
		index++;
	}
	return x;
}