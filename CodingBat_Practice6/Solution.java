

public class Solution {

	
	public static void main(String[] args) {
		StringFunctions.Utils.set("cool");
		System.out.println(StringFunctions.Utils.get());
		
		int[] array = {1,1,0,0,1,0,1,1,1,0,1,1,1};
		int[] testArray;
	    int len = array.length;
	    int max = 0;
	    int count = 0;
	    for (int i = 0; i < len; i++) {
	      if (array[i] == 0) {
//	    	System.out.println("i is at " + i);
	        testArray = array;
//	        System.out.println("testArray[" + i +"] is being replaced with a one");
	        for (int k = 0; k < testArray.length; k++) {
	        	System.out.print(testArray[k]);
	        }
	        System.out.println(", ");
	        for (int j = 0; j < len; j++) {
	          if (testArray[j] == 1) {
//	        	  System.out.println("j is at " + j);
	            count++;
//	            System.out.println("count is at " + count);
	          }
	          if (testArray[j] == 0 || j > len - 1) {
	            max = Math.max(max, count);
//	            System.out.println("max is at" + max);
	            count = 0;
	          }
	        }
	      }
	    }
	    System.out.println(max);
	}
}
