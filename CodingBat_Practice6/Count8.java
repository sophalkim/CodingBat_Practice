public int count8(int n) {
  int count = 0;
  if (n % 10 == 8 || n == 8) count++;
  if (n % 10 == 8 && (n / 10) % 10 == 8) count++;
  if (n < 10) return count;
  return count + count8(n / 10);
}