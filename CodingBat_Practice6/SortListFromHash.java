import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class SortListFromHash {
	
	public ArrayList<String> hashToArray(HashMap<String, String> map) {
	    ArrayList<String> list = new ArrayList<String>();
	    for (String value : map.values()) {
	      list.add(value);
	    }
	    Collections.sort(list);
	    return list;
	  }
	  
	  public static void main(String[] args) {
	    HashMap<String, String> map = new HashMap<String, String>();
	    map.put("name", "Sophal");
	    map.put("email", "sokim209@gmail.com");
	    map.put("brother", "Sophon");
	    map.put("sister", "Kevin");
	    map.put("cat", "Mickey");
	    map.put("food", "bacon");
	    SortListFromHash s = new SortListFromHash();
	    System.out.println(s.hashToArray(map));
	  }
}
