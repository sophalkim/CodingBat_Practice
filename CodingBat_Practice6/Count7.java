public int count7(int n) {
  int count = 0;
  if (n % 10 == 7) {
    count++;
  }
  if (n < 10) return count;
  return count + count7(n / 10);
}