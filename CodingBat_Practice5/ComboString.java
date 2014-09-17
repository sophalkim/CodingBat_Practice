public String comboString(String a, String b) {
	String small = "";
	String big = "";
	if (a.length() > b.length()) {
		big = a;
		small = b;
	} else {
		big = b;
		small = a;
	}
	return small + big + small;
}