public String deFront(String str) {
	int len = str.length();
	String x = "";
	if (len >= 1 && str.substring(0, 1).equals("a"))
		x += "a";
	if (len >= 2 && str.substring(1, 2).equals("b"))
		x += "b";
	if (len >= 3)
		x += str.substring(2);
	return x;
}