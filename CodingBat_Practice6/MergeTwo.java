
public class MergeTwo {
	public String[] mergeTwo(String[] a, String[] b, int n) {
	    String result[] = new String[n];
	    int indexA = 0;
	    int indexB = 0;
	    for (int i = 0; i < n; i++) {
	      int compare = a[indexA].compareTo(b[indexB]);
	      if (compare <= 0) {
	        result[i] = a[indexA++];
	        if (compare == 0) indexB++;
	      } else {
	        result[i] = b[indexB++];
	      }
	    }
	    return result;
	  }
	  
	  public static void main(String[] args) {
	    MergeTwo s = new MergeTwo();
	    String[] a = {"x", "y", "z"};
	    String[] b = {"a", "b", "z"};
	    int n = 3;
	    for (int i = 0; i < n; i++) {
	      System.out.println(s.mergeTwo(a, b, n)[i]);
	    }
	  }
}
