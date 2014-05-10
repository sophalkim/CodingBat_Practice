
public class sameEnds {
	public static void main(String[] args) {
		int len = 1;
		int[] nums = {5, 6, 45, 99, 13, 5, 6};
		int[] front = new int[len];
		int[] back = new int[len];
		  for (int i=0; i<len; i++) {
		    front[i] = nums[i];
		    System.out.println("x " +front[i]);
		    back[i] = nums[nums.length-len+i];
		    System.out.println("y " + back[i]);
		  }
	}
}
