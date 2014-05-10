package November2013;

public class SumDigits {

	public static int sumDigits(String str) {
		  int sum = 0;
		  for (int i = 0; i <str.length(); i++) {
			  if (Character.isDigit(str.charAt(i))) {
				  sum = sum + Integer.parseInt(str.substring(i, i + 1));
			  }
		  }
		  return sum;
	}
	
	
	public static void main(String[] args) {
		
		String str = "Chocolate";
		System.out.println(sumDigits(str));
	}
}
