package November2013;

public class SumNumbers {

	public static int sumNumbers(String str) {
		  int sum = 0;
		  for (int i = 0; i <str.length(); i++) {
			  if (Character.isDigit(str.charAt(i))) {
				  for (int j = i; j < str.length(); j++) {
					  if (Character.isDigit(str.charAt(j))) {
					  } else {
						  sum = sum + Integer.parseInt(str.substring(i, j));
						  i = j + 1;
					  }
				  }
			  }
		  }
		  return sum;
	}
	
	
	public static void main(String[] args) {
		
		String str = "abc123xyz";
		System.out.println(sumNumbers(str) + "");
	}
}
