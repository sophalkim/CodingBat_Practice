
public class SeriesUp {

	public int[] seriesUp(int n) {
	    int series = 1;
	    int[] result = new int[n * (n + 1) / 2];
	    int len = result.length;
	    for (int i = 0; i < len; i++) {
	      for (int j = 0; j < series; j++) {
	        result[i + j] = j + 1;
	      }
	      series++;
	    }
	    return result;
	  }
	  
	  
	  public static void main(String[] args) {
	    int n = 4;
	    
	    SeriesUp s = new SeriesUp();
	    System.out.println(s.seriesUp(n));
	  }
	
}
