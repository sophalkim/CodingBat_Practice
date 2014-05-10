package Practice3;

public class MaxBlock {

	public static int maxBlock(String str) {
		  int count = 1;
		  int max = 1;
		  int len = str.length();
		  if (len < 1) {
		    return 0;
		  }
		  for (int i = 0; i < len - 1; i++) {
		    if (str.substring(i, i + 1).equals(str.substring(i + 1, i + 2))) {
		      count = 2;
		      for (int j = i + 1; j < len - 1; j++) {
		        if (str.substring(j, j + 1).equals(str.substring(j + 1, j + 2))) {
		          count++;
		          System.out.println(count);
		        } else {
		        	break;
		        }
		      }
		      max = Math.max(max, count);
	          count = 1;
		    }
		  }
		  return max;
		}
	
	
	public static void main(String[] args) {
		String str = "XXBBBBbbxx";
		System.out.println(maxBlock(str));
	}
}
