public String changePi(String str) {
	int len = str.length();
	String result = "";
	if (len <= 0) return result;
	if (len >= 2 && str.substring(0, 2).equals("pi")) {
		result += "3.14";
		str = str.substring(1);
	} else {
		result += str.substring(0, 1);
	}
	return result + changePi(str.substring(1));
}