package Practice3;

public class SumNumbers {

	public static int sumNumbers(String str) {
		int len = str.length();
		int sum = 0;
		int number = 0;
		int count = 0;
		for (int i = 0; i < len; i++) {
			System.out.println("i:" + i + "number: " + Character.isDigit(str.charAt(i)));
			if (Character.isDigit(str.charAt(i))) {
				count = 1;
				for (int j = i + 1; j < len; j++) {
					if (Character.isDigit(str.charAt(j))) {
						count++;
						System.out.println("count: " + count);
					} else {
						break;
					}
					
				}
				number = Integer.parseInt(str.substring(i, i + count));
				sum += number;
				number = 0;
				i += count;
			}
		}
		return sum;
	}
		
	public static void main(String[] args) {
		String str = "aa11b33";
		System.out.println(sumNumbers(str));
	}
}
