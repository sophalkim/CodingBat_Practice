public String allStar(String str) {
	String result = "";
  if (str.length() <= 0) return result;
  result += str.substring(0, 1);
  if (str.length() >= 2) result += "*";
  return result + allStar(str.substring(1));
}