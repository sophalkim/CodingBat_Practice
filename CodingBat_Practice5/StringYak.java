public String stringYak(String str) {
	int len = str.length();
	String x = "";
	for (int i = 0; i < len; i++) {
		if (i + 2 < len) {
			if (str.charAt(i) == 'y' && str.charAt(i+2) == 'k') {
				i+=2;
				continue;
			}
		}
		x += str.charAt(i);
	} 
	return x;
}