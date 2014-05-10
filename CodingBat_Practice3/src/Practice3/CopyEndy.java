package Practice3;

public class CopyEndy {

	public static int[] copyEndy(int[] nums, int count) {
		String x = "bb";
		String y = "zz";
		int z = x.compareTo(y);
		System.out.print("Compare To" + z);
		return nums;
	}
	
	public static boolean isEndy(int n) {
		  return (n >= 0 && n <= 10 || n >= 90 && n <= 100);
	}
	
	public static void main(String[] args) {
		int[] nums = {9, 11, 90, 22, 6};
		int count = 2;
		System.out.println(copyEndy(nums, count));
		System.out.println("is the number 76 isEndy? " + isEndy(76));
	}
}
