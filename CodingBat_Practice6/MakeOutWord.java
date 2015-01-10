public String makeOutWord(String out, String word) {
	int middle = out.length() / 2;
	return out.substring(0, middle) + word + out.substring(middle, out.length());
}