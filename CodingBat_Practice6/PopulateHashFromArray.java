import java.util.HashMap;
import java.util.Map;


public class PopulateHashFromArray {
	public HashMap<String, String> populateMap(HashMap<String, String> map) {
	    String[] words = { "cool", "awesome", "amazing", "great", "rad" };
	    for (int i = 0; i < words.length; i++) {
	      map.put(i + "", words[i]);
	    }
	    return map;
	  }
	  
	  public static void main(String[] args) {
	    PopulateHashFromArray s = new PopulateHashFromArray();
	    HashMap<String, String> map = new HashMap<String, String>();
	    map = s.populateMap(map);
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	      System.out.println("id:" + entry.getKey() + ", name:" + entry.getValue());
	    }
	  }
}
