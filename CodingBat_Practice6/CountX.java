public int countX(String str) {
  int count = 0;
  int len = str.length();
  if (len == 0) return 0;
  if (str.charAt(len - 1) == 'x') count++;
  if (len == 1) return count;
  return count + countX(str.substring(0, len - 1));
}